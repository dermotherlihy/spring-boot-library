package com.dermotherlihy.library.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dermot.herlihy on 30/08/15.
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.dermotherlihy.library"})
@EnableConfigurationProperties(LibraryConfig.class)
public class ApplicationStartup {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStartup.class, args);
    }
}
