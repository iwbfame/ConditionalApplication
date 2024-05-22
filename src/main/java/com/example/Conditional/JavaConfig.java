package com.example.Conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

public class JavaConfig {
    @Bean
    @ConditionalOnProperty
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
