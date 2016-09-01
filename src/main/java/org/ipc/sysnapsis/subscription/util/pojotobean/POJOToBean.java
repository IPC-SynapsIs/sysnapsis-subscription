package org.ipc.sysnapsis.subscription.util.pojotobean;

import org.ipc.sysnapsis.subscription.bean.out.SubscriptionOut;
import org.ipc.sysnapsis.subscription.entity.Subscription;

/**
 * Created by Ghislain on 22/08/2016.
 */
public class POJOToBean {

    public static SubscriptionOut getSubscriptionOut(Subscription subscription){
        SubscriptionOut subscriptionOut = new SubscriptionOut();
        subscriptionOut.setCollaboratorID(subscription.getCollaboratorID());
        subscriptionOut.setProjectID(subscription.getProjetID());
        subscriptionOut.setStatus(subscription.getStatus());
        return subscriptionOut;
    }
}
