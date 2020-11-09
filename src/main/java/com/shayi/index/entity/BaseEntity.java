package com.shayi.index.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name = "create_time", columnDefinition = "DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'data create time'")
    private Date createTime;

    @LastModifiedDate
    @Column(name = "update_time", columnDefinition = "DATETIME DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT 'data last modify time'")
    private Date updateTime;

}