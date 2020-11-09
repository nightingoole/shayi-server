package com.shayi.index.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "lesson")
public class Lesson extends BaseEntity {

    @Column(name = "your_name", columnDefinition = "VARCHAR(10) DEFAULT NULL COMMENT 'request student name'")
    private String yourName;

    @Column(name = "sub_type", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'request lesson sub type'")
    private String subType;

    @Column(name = "sub_title", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'request lesson sub title'")
    private String subTitle;

    @Column(name = "teach_type", columnDefinition = "TINYINT DEFAULT 0 COMMENT 'teach style, 0:online, 1:offline'")
    private Integer teachType;

    @Column(name = "gender", columnDefinition = "TINYINT DEFAULT 0 COMMENT '0: male, 1: female, 2: others'")
    private Integer gender;

    @Column(name = "afford_per_hour", columnDefinition = "INT DEFAULT 0 COMMENT 'can afford per hour'")
    private Integer affordPerHour;

    @Column(name = "educate_want", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'the educate teacher you want'")
    private String educateWant;

    @Column(name = "address", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'address you live now'")
    private String address;

    @Column(name = "teach_style_tags", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'teacher style you want'")
    private String teachStyleTags;

    @Column(name = "your_desc", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'student description'")
    private String youDesc;

    @Column(name = "targets", columnDefinition = "VARCHAR(1024) DEFAULT NULL COMMENT 'your targets, split by ; '")
    private String targets;

    @Column(name = "start_time", columnDefinition = "DATETIME DEFAULT NULL COMMENT 'lesson start time'")
    private Date startTime;

    @Column(name = "end_time", columnDefinition = "DATETIME DEFAULT NULL COMMENT 'lesson end time'")
    private Date endTime;

    @Column(name = "time_per_week", columnDefinition = "INT DEFAULT 0 COMMENT 'time per week you wish'")
    private Integer timePerWeek;

}
