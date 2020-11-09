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
@Table(name = "teacher")
public class Teacher extends BaseEntity {


    @Column(name = "salary_per_hour", columnDefinition = "INT DEFAULT 0 COMMENT 'teacher salary per hour wished'")
    private Integer salaryPerHour;

    @Column(name = "lesson_style_tags", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'style tag like RED, GREEN, split by ,'")
    private String lessonStyleTags;

    @Column(name = "could_teach_online", columnDefinition = "BIT DEFAULT 0 COMMENT 'can teacher teach online?'")
    private boolean couldTeachOnline;

    @Column(name = "could_teach_offline", columnDefinition = "BIT DEFAULT 0 COMMENT 'can teacher teach offline?'")
    private boolean couldTeachOffline;

    @Column(name = "offline_classroom", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'offline teach class room if teacher can take lesson offline'")
    private String offlineClassroom;

    @Column(name = "address", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'address live now'")
    private String address;

    @Column(name = "subject", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'teacher subject can teach, split by , like Math,English'")
    private String subject;

    @Column(name = "school", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'graduate school'")
    private String school;

    @Column(name = "is_graduate", columnDefinition = "BIT DEFAULT 0 COMMENT 'is graduate from school'")
    private boolean isGraduate;

    @Column(name = "education", columnDefinition = "VARCHAR(45) DEFAULT NULL COMMENT 'highest education'")
    private String education;

    @Column(name = "edu_desc", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'several words to desc your school'")
    private String eduDesc;

    @Column(name = "start_time", columnDefinition = "DATETIME DEFAULT NULL COMMENT 'teach can start time'")
    private Date startTime;

    @Column(name = "end_time", columnDefinition = "DATETIME DEFAULT NULL COMMENT 'teach can end time'")
    private Date endTime;

    @Column(name = "career", columnDefinition = "VARCHAR(1024) DEFAULT NULL COMMENT 'your business career'")
    private String career;

    @Column(name = "teach_style_tags", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT 'teach style tag, split by , '")
    private String teachStyleTags;

    @Column(name = "teach_auth_prove", columnDefinition = "VARCHAR(1024) DEFAULT NULL COMMENT 'teach auth prove images, split by ; '")
    private String teachAuthProve;

}
