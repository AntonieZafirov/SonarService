package com.en.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by azafirov on 10/21/2016.
 */
@Entity
@Table(name = "Adapter")
public class AdapterEntity{

    private Long id;

    private String name;

    private String url;

    @JsonIgnore
    private String apiPath;

    @JsonIgnore
    private Boolean useCredantials;

    @JsonIgnore
    private String userName;

    @JsonIgnore
    private String password;

    @JsonIgnore
    private IntegrationServiceEntity integrationServiceEntity;

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

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApiPath() {
        return this.apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public Boolean getUseCredantials() {
        return this.useCredantials;
    }

    public void setUseCredantials(Boolean useCredantials) {
        this.useCredantials = useCredantials;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToOne
    @JoinColumn(name = "integrationService_id")
    public IntegrationServiceEntity getIntegrationServiceEntity() {
        return this.integrationServiceEntity;
    }

    public void setIntegrationServiceEntity(IntegrationServiceEntity integrationServiceEntity) {
        this.integrationServiceEntity = integrationServiceEntity;
    }
}
