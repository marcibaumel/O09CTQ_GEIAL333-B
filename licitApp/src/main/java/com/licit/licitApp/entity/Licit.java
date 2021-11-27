package com.licit.licitApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Licit {

    @Id
    @GeneratedValue
    private UUID licitId;

    private String itemName;

    private String username;

    private int licitMoney;


}
