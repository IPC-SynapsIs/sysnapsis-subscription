package org.ipc.sysnapsis.subscription.dao.impl;

import org.ipc.sysnapsis.subscription.dao.SubscriptionDAO;
import org.ipc.sysnapsis.subscription.entity.Subscription;
import org.ipc.sysnapsis.subscription.repository.SubscriptionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by Ghislain on 21/08/2016.
 */
@Component
public class SubscriptionDAOImpl implements SubscriptionDAO {

    @Autowired
    SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription get(final String idCollaborateur) {
        Subscription subscription = subscriptionRepository.findOne(UUID.fromString(idCollaborateur));

        return subscription;
    }

    @Override
    public Iterable<Subscription> getAll() {
        Iterable<Subscription> subscriptions = subscriptionRepository.findAll();
        return subscriptions;
    }

    @Override
    public Subscription add(final Subscription subscription) {
        Subscription subscription1 = subscriptionRepository.save(subscription);
        return subscription1;
    }

    @Override
    public Subscription update(Subscription subscription) {
        Subscription subscription1 = subscriptionRepository.save(subscription);
        return subscription1;
    }

    @Override
    public void remove(String idSubscription) {
        subscriptionRepository.delete(UUID.fromString(idSubscription));

    }
}
