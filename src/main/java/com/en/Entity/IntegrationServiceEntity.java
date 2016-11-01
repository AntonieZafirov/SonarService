package com.en.Entity;

import javax.persistence.*;

/**
 * Created by azafirov on 10/21/2016.
 */
@Entity
@Table(name = "IntegrationService")
public class IntegrationServiceEntity {

    private Long id;

    private String name;

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

}
