package org.ipc.sysnapsis.subscription.proxy;

import org.ipc.sysnapsis.subscription.bean.out.SubscriptionOut;
import org.ipc.sysnapsis.subscription.entity.Subscription;

/**
 * Created by Ghislain on 21/08/2016.
 */
public interface SubscriptionProxy {
    Subscription get(final String idCollaborateur);
    Iterable<Subscription> getAll();
    Subscription add(final Subscription subscription);
    Subscription update(final Subscription subscription);
    void remove(final String idSubscription);
}
