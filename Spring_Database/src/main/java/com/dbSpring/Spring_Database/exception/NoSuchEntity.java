package com.dbSpring.Spring_Database.exception;


public class NoSuchEntity extends RuntimeException {

    private Long id;

    public NoSuchEntity(Long id){
        super("No such entity "+id);
        this.id = id;
    }


}
