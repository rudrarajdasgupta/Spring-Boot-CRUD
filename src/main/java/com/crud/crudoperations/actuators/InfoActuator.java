package com.crud.crudoperations.actuators;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class InfoActuator implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("application", "CRUD Operations Example")
                .withDetail("version", "1.0.0")
                .withDetail("description", "This is app demonstrates CRUD operations in spring boot.")
                .build();
    }
}
