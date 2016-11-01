package com.en.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: azafirov
 * Date: 10/31/2016
 * Time: 1:04 PM
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
@Table(name = "Application")
public class ApplicationEntity {

    private Long id;

    private String name;

    private List<WidgetEntity> widgets = new ArrayList<>();

    public ApplicationEntity() {
    }

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

    @ManyToMany
    @JoinTable(name="APPLICATION_WIDGET", joinColumns={@JoinColumn(name="APP_ID")}, inverseJoinColumns={@JoinColumn(name="WIDGET_ID")})
    public List<WidgetEntity> getWidgets() {
        return this.widgets;
    }

    public void setWidgets(List<WidgetEntity> widgets) {
        this.widgets = widgets;
    }
}

