package com.example.demoyaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyProps.class)
public class DemoYamlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoYamlApplication.class, args);
    }

}
