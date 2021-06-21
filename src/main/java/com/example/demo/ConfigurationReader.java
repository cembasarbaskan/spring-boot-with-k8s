package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app.config")
@Configuration
public class ConfigurationReader {
    private String message;
    private Boolean featureEnabled;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getFeatureEnabled() {
        return featureEnabled;
    }

    public void setFeatureEnabled(Boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }
}
