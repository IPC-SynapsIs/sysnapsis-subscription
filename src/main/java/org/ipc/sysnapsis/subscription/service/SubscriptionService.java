package org.ipc.sysnapsis.subscription.service;

import org.ipc.sysnapsis.subscription.bean.in.SubscriptionIn;
import org.ipc.sysnapsis.subscription.bean.out.SubscriptionOut;
import org.ipc.sysnapsis.subscription.entity.Subscription;

/**
 * Created by Ghislain on 21/08/2016.
 */
public interface SubscriptionService {
    SubscriptionOut get(final String idCollaborateur);
    Iterable<SubscriptionOut> getAll();
    SubscriptionOut add(final SubscriptionIn subscriptionIn);
    SubscriptionOut update(final SubscriptionIn subscriptionIn);
    void remove(final String idSubscription);
}
