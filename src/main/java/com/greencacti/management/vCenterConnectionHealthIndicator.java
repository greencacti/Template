package com.greencacti.management;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by baominw on 4/12/17.
 */
@Component
public class vCenterConnectionHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        //int errorCode = check(); // perform some specific health check
        int errorCode = 1;
        if (errorCode != 0) {
            return Health.down().withDetail("vCenter is down", errorCode).build();
        }
        return Health.up().build();
    }
}