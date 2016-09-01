package org.ipc.sysnapsis.subscription.proxy.impl;

import org.ipc.sysnapsis.subscription.bean.out.SubscriptionOut;
import org.ipc.sysnapsis.subscription.dao.SubscriptionDAO;
import org.ipc.sysnapsis.subscription.entity.Subscription;
import org.ipc.sysnapsis.subscription.proxy.SubscriptionProxy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ghislain on 21/08/2016.
 */
public class SubscriptionProxyImpl implements SubscriptionProxy{

    @Autowired
    SubscriptionDAO subscriptionDAO;

    @Override
    public Subscription get(String idCollaborateur) {
        return subscriptionDAO.get(idCollaborateur);
    }

    @Override
    public Iterable<Subscription> getAll() {
        return subscriptionDAO.getAll();
    }

    @Override
    public Subscription add(Subscription subscription) {
        return subscriptionDAO.add(subscription);
    }

    @Override
    public Subscription update(Subscription subscription) {
        return subscriptionDAO.update(subscription);
    }

    @Override
    public void remove(String idSubscription) {
        subscriptionDAO.remove(idSubscription);
    }
}
