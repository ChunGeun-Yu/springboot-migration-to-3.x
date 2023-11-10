package com.example.springboot.migration.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="SIMPLE")
public class SimpleEntity {

    @Id
    private String id;

    private String name;
}
