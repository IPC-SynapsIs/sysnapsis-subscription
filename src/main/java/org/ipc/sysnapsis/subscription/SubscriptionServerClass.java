package org.ipc.sysnapsis.subscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Ghislain on 14/08/2016.
 */

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages = {"org.ipc.synapsis.subscription.repository"})
public class SubscriptionServerClass {

    public static void main(final String[] args) {
        SpringApplication.run(SubscriptionServerClass.class, args);
    }
}
