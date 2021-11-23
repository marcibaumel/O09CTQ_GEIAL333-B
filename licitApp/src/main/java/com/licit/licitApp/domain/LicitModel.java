package com.licit.licitApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LicitModel {

    @Id
    @GeneratedValue
    private Long UserId;

}
