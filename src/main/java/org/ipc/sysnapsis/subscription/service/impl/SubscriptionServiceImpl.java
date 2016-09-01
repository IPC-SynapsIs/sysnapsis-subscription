package org.ipc.sysnapsis.subscription.service.impl;

import org.ipc.sysnapsis.subscription.bean.in.SubscriptionIn;
import org.ipc.sysnapsis.subscription.bean.out.SubscriptionOut;
import org.ipc.sysnapsis.subscription.entity.Subscription;
import org.ipc.sysnapsis.subscription.proxy.SubscriptionProxy;
import org.ipc.sysnapsis.subscription.service.SubscriptionService;
import org.ipc.sysnapsis.subscription.util.beantopojo.BeanToPOJO;
import org.ipc.sysnapsis.subscription.util.pojotobean.POJOToBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Ghislain on 21/08/2016.
 */
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    SubscriptionProxy subscriptionProxy;

    @Override
    public SubscriptionOut get(String idCollaborateur) {
        SubscriptionOut subscriptionOut = null;
        Subscription subscription = subscriptionProxy.get(idCollaborateur);
        subscriptionOut = POJOToBean.getSubscriptionOut(subscription);
        return subscriptionOut;
    }

    @Override
    public Iterable<SubscriptionOut> getAll() {
        ArrayList<SubscriptionOut> subscriptions = new ArrayList<>();
        Iterable<Subscription> subscriptions1 = subscriptionProxy.getAll();

        for(Subscription subscription : subscriptions1){
            SubscriptionOut subscriptionOut = POJOToBean.getSubscriptionOut(subscription);
            subscriptions.add(subscriptionOut);
        }
        return subscriptions;
    }

    @Override
    public SubscriptionOut add(SubscriptionIn subscriptionIn) {
        UUID uuid = UUID.randomUUID();
        Subscription subscription = BeanToPOJO.getSubscription(subscriptionIn);
        subscription.setId(uuid);
        subscriptionProxy.add(subscription);
        return POJOToBean.getSubscriptionOut(subscription);
    }

    @Override
    public SubscriptionOut update(SubscriptionIn subscriptionIn) {
        Subscription subscription = BeanToPOJO.getSubscription(subscriptionIn);
        //TO DO
        return null;
    }

    @Override
    public void remove(String idSubscription) {
    subscriptionProxy.remove(idSubscription);
    }
}
