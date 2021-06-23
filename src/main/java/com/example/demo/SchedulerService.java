package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SchedulerService {
    private final ConfigurationReader configurationReader;

    public SchedulerService(ConfigurationReader configurationReader) {
        this.configurationReader = configurationReader;
    }

    @Scheduled(fixedDelay = 1000)
    public void schedule() {
        log.info("Config message: " + configurationReader.getMessage());
    }
}
