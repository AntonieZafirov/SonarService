package com.en.ServiceResponseModels;

import com.en.Entity.WidgetEntity;

/**
 * Created by IntelliJ IDEA.
 * User: azafirov
 * Date: 11/1/2016
 * Time: 3:44 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class WidgetServiceResponseModel {

    private Long id;

    private String name;

    private Long adapterId;

    private String adapterName;

    private String description;

    private String config;

    public WidgetServiceResponseModel(WidgetEntity widgetEntity) {
        this.id = widgetEntity.getId();
        this.name = widgetEntity.getName();
        this.adapterId = widgetEntity.getAdapter().getId();
        this.adapterName = widgetEntity.getAdapter().getName();
        this.description = widgetEntity.getDescription();
        this.config = widgetEntity.getConfig();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAdapterId() {
        return adapterId;
    }

    public void setAdapterId(Long adapterId) {
        this.adapterId = adapterId;
    }

    public String getAdapterName() {
        return adapterName;
    }

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    public String getDescription() {
        return description;
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
