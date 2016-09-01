package org.ipc.sysnapsis.subscription.resource.impl;

import io.swagger.annotations.*;
import org.ipc.sysnapsis.subscription.bean.in.SubscriptionIn;
import org.ipc.sysnapsis.subscription.bean.out.SubscriptionOut;
import org.ipc.sysnapsis.subscription.entity.Subscription;
import org.ipc.sysnapsis.subscription.resource.SubscriptionResource;
import org.ipc.sysnapsis.subscription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.UUID;

/**
 * Created by Ghislain on 21/08/2016.
 */
@RestController
@RequestMapping(value = "/api/subscription")
@Api(value = "Subscription", description = "Subscription resource base endpoint")
public class SubscriptionResourceImpl implements SubscriptionResource {

    @Autowired
    SubscriptionService subscriptionService;

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Search an existing Subscription")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Subscription exits", response = SubscriptionOut.class)
    })
    public ResponseEntity get(@ApiParam(value = "The id of the collaboration") final String idCollaborateur) {
        SubscriptionOut subscriptionOut = subscriptionService.get(idCollaborateur);
        return ResponseEntity.ok(subscriptionOut);
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Search all existing Subscriptions")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "All exiting subsciptions", response = Iterable.class)
    })
    public ResponseEntity getAll() {
        Iterable<SubscriptionOut> subscriptions = subscriptionService.getAll();
        return ResponseEntity.ok(subscriptions);
    }

    @Override
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Add a new Subscription")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Subscription successfully created", response = URI.class)
    })
    public ResponseEntity add(SubscriptionIn subscriptionIn) {
        SubscriptionOut subscription = subscriptionService.add(subscriptionIn);
        return ResponseEntity.ok(subscription);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Update an existing Subscription")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Subscription successfully updated", response = void.class)
    })
    public ResponseEntity update(@ApiParam(value = "Id of the subscription to update", required = true) @PathVariable("id") final SubscriptionIn subscriptionIn) {
       subscriptionService.update(subscriptionIn);
        return ResponseEntity.ok().build();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Deletes an existing Subscriptions")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Subscription successfully deleted", response = void.class)
    })
    public ResponseEntity remove(String idSubscription) {
        subscriptionService.remove(idSubscription);
        return ResponseEntity.ok().build();
    }
}
