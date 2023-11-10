package com.example.springboot.migration.repository;

import com.example.springboot.migration.entity.SimpleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleRepository extends JpaRepository<SimpleEntity, String> {


}
