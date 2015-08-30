package com.dermotherlihy.library.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by dermot.herlihy on 30/08/15.
 */
@Component
@ConfigurationProperties(prefix="library")
public class LibraryConfig {

    private long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
