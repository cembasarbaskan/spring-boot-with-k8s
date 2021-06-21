package com.example.demo;

import com.example.demo.ConfigurationReader;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {
    private final ConfigurationReader configurationReader;

    public SchedulerService(ConfigurationReader configurationReader) {
        this.configurationReader = configurationReader;
    }

    @Scheduled(fixedDelay = 1500)
    public void schedule() {
        System.out.println("Config message: " + configurationReader.getMessage());
        System.out.println("Feature flag: " + configurationReader.getFeatureEnabled());
    }
}
