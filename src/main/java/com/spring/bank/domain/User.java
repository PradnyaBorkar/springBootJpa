package com.spring.bank.domain;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="User")
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;


    @Column(name="first_name",nullable=false)
    private String firstName;

    @Column(name="last_name", nullable=false, length=50)
    private String lastName;

    @Column(name="email")
    private String email;

}