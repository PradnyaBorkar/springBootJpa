package com.spring.bank.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name="User")
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @NotBlank(message = "firstName is mandatory")
    @Column(name="first_name",nullable=false)
    private String firstName;

    @NotBlank(message = "last_name is mandatory")
    @Size(max = 20)
    @Column(name="last_name", nullable=false)
    private String lastName;

    @Column(name="email")
    private String email;

}