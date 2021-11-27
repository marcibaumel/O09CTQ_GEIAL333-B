package com.licit.licitApp.controller.dto;

import com.licit.licitApp.service.dto.Licit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LicitDto {

    private UUID licitId;

    private String itemName;

    private String username;

    private int licitMoney;

    public Licit toServiceDto(){
        return new Licit(licitId, itemName, username, licitMoney);
    }

    public LicitDto(Licit licit){
        this.licitId = licit.getLicitId();
        this.itemName = licit.getItemName();
        this.username = licit.getUsername();
        this.licitMoney = licit.getLicitMoney();
    }
}
