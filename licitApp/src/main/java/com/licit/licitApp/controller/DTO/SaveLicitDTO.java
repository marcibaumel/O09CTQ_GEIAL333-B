package com.licit.licitApp.controller.DTO;

import com.licit.licitApp.services.DTO.LicitDTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class SaveLicitDTO {
    @NotNull
    @Min(1)
    private Integer UserId;

    @NotNull
    @Min(1)
    private Integer Licit;

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

    public SaveLicitDTO(Integer userId, Integer licit) {
        UserId = userId;
        Licit = licit;
    }

    public LicitDTO toLicitDTO(){
        return new LicitDTO(UserId, Licit);
    }
}
