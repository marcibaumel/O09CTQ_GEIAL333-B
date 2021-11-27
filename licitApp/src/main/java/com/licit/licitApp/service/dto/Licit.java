package com.licit.licitApp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Licit {

    private UUID licitId;

    private String itemName;

    private String username;

    private int licitMoney;

    public Licit(Optional<com.licit.licitApp.entity.Licit> licitEntity) {
        this.licitId=licitEntity.get().getLicitId();
        this.itemName = licitEntity.get().getItemName();
        this.username = licitEntity.get().getUsername();
        this.licitMoney = licitEntity.get().getLicitMoney();
    }


    public com.licit.licitApp.entity.Licit toEntity(){
        return new com.licit.licitApp.entity.Licit(licitId, itemName, username, licitMoney);
    }

    public Licit(com.licit.licitApp.entity.Licit licitEntity){
        this.licitId=licitEntity.getLicitId();
        this.itemName = licitEntity.getItemName();
        this.username = licitEntity.getUsername();
        this.licitMoney = licitEntity.getLicitMoney();
    }
}
