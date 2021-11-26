package com.licit.licitApp.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "LicitTable")
public class Licit {
    @Id
    @GeneratedValue
    private UUID licitId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserTable", referencedColumnName = "userId")
    private User userId;


    private int licitMoney;

    @GeneratedValue
    private LocalDate licitTime;

}
