package com.shayi.index.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "username", columnDefinition = "VARCHAR(255) NOT NULL COMMENT 'user name'")
    private String username;

    @Column(name = "password", columnDefinition = "VARCHAR(255) NOT NULL COMMENT 'user pass'")
    private String password;

    @Column(name = "first_name", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'first name'")
    private String firstName;

    @Column(name = "last_name", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'last name'")
    private String lastName;

    @Column(name = "fist_name_en", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'first name in english'")
    private String firstNameEn;

    @Column(name = "last_name_en", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'last name in english'")
    private String lastNameEn;

    @Column(name = "header", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'user head image'")
    private String header;

    @Column(name = "gender", columnDefinition = "TINYINT DEFAULT 0 COMMENT 'user gender, 0:male, 1:female, 2:others'")
    private Integer gender;

    @Column(name = "email", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'user email'")
    private String email;

    @Column(name = "phone", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'user phone number'")
    private String phone;

    @Column(name = "role", columnDefinition = "VARCHAR(10) DEFAULT 'STUDENT' COMMENT 'user role type: STUDENT, TEACHER, ADMIN'")
    private String role;

    @Column(name = "role_detail_id", columnDefinition = "INT DEFAULT 0 COMMENT 'role detail id'")
    private Integer roleDetailId;

}
