package com.licit.licitApp.service.exception;

import java.util.UUID;

public class NotEnoughLicitException extends RuntimeException{

    private UUID id;

    public NotEnoughLicitException(UUID id){
        super("No enough raise with this licit "+id);
        this.id = id;
    }
}
