package com.licit.licitApp.controller.dto;

import com.licit.licitApp.service.dto.Licit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateLicitDto {
    @NotEmpty
    private String itemName;
    @NotEmpty
    private String username;
    @NotNull
    @Min(10)
    private int licitMoney;

    public Licit toLicit(){
        return new Licit(null, itemName, username, licitMoney);
    }


}
