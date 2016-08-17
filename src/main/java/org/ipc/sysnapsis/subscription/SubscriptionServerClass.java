package org.ipc.sysnapsis.subscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Ghislain on 14/08/2016.
 */

@SpringBootApplication
@EnableEurekaClient
public class SubscriptionServerClass {

    public static void main(final String[] args) {
        SpringApplication.run(SubscriptionServerClass.class, args);
    }
}
