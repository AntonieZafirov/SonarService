package com.en.Entity;

import javax.persistence.*;

/**
 * Created by azafirov on 10/21/2016.
 */
@Entity
@Table(name = "Widget")
public class WidgetEntity {

    private Long id;

    private String name;

    private AdapterEntity adapter;

    private String callUrl;

    private String description;

    private String config;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "adapter_id")
    public AdapterEntity getAdapter() {
        return this.adapter;
    }

    public void setAdapter(AdapterEntity adapter) {
        this.adapter = adapter;
    }

    public String getCallUrl() {
        return this.callUrl;
    }

    public void setCallUrl(String callUrl) {
        this.callUrl = callUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
