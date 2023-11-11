package com.example.springboot.migration.entity;

import lombok.Data;

// migration
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Data
@Entity
@Table(name="SIMPLE")
public class SimpleEntity {

    @Id
    private String id;

    private String name;
}
