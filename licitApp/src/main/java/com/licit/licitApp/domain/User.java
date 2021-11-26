package com.licit.licitApp.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "UserTable")
public class User {

    @Id
    @GeneratedValue
    private UUID userId;

    private String userName;

    private LocalDate userBirthday;

    @OneToOne(mappedBy = "userId")
    private Licit licit;


    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(LocalDate userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Licit getLicit() {
        return licit;
    }

    public void setLicit(Licit licit) {
        this.licit = licit;
    }

    public User() {
    }

    public User(UUID userId, String userName, LocalDate userBirthday, Licit licit) {
        this.userId = userId;
        this.userName = userName;
        this.userBirthday = userBirthday;
        this.licit = licit;
    }
}
