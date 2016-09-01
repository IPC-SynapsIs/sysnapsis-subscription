package org.ipc.sysnapsis.subscription.resource;

import org.ipc.sysnapsis.subscription.bean.in.SubscriptionIn;
import org.springframework.http.ResponseEntity;

/**
 * Created by Ghislain on 21/08/2016.
 */
public interface SubscriptionResource {
    ResponseEntity get(final String idCollaborateur);
    ResponseEntity getAll();
    ResponseEntity add(final SubscriptionIn subscriptionIn);
    ResponseEntity update(final SubscriptionIn subscriptionIn);
    ResponseEntity remove(final String idSubscription);
}
