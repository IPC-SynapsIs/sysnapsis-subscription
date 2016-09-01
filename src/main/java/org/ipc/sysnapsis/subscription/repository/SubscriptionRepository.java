package org.ipc.sysnapsis.subscription.repository;

import org.ipc.sysnapsis.subscription.entity.Subscription;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by Ghislain on 21/08/2016.
 */
public interface SubscriptionRepository extends CrudRepository<Subscription, UUID> {
}
