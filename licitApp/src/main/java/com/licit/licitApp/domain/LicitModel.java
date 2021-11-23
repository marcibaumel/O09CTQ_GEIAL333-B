package com.licit.licitApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LicitModel {

    @Id
    @GeneratedValue
    public Long id;

    private Integer UserId;

    private Integer Licit;


    public LicitModel(Integer userId, Integer licit) {
        UserId = userId;
        Licit = licit;
    }

    public LicitModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getLicit() {
        return Licit;
    }

    public void setLicit(Integer licit) {
        Licit = licit;
    }
}
