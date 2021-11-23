package com.licit.licitApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LicitModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
