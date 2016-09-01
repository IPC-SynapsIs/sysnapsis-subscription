package org.ipc.sysnapsis.subscription.util.beantopojo;

import org.ipc.sysnapsis.subscription.bean.in.SubscriptionIn;
import org.ipc.sysnapsis.subscription.entity.Subscription;

/**
 * Created by Ghislain on 22/08/2016.
 */
public class BeanToPOJO {
    public static Subscription getSubscription(SubscriptionIn subscriptionIn){
        Subscription subscription = new Subscription();

        subscription.setCollaboratorID(subscriptionIn.getCollaboratorID());
        subscription.setProjetID(subscriptionIn.getProjectID());
        subscription.setStatus(subscriptionIn.getStatus());
        return subscription;
    }
}
