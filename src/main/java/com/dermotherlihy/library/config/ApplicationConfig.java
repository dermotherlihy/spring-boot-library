package com.dermotherlihy.library.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * Created by dermot.herlihy on 30/08/15.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public PropertySource<?> yamlPropertySourceLoader() throws IOException {
        YamlPropertySourceLoader loader = new YamlPropertySourceLoader();
        PropertySource<?> applicationYamlPropertySource = loader.load(
                "application.yml", new ClassPathResource("application.yml"),"default");
        return applicationYamlPropertySource;
    }


}
