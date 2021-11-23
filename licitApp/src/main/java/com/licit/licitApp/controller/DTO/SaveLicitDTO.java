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

    public LicitDTO toLicitDTO(){
        return new LicitDTO(UserId, Licit);
    }
}
