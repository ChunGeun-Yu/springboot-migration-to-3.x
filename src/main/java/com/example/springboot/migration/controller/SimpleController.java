package com.example.springboot.migration.controller;

import com.example.springboot.migration.dto.SimpleDto;
import com.example.springboot.migration.service.SimpleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
public class SimpleController {

    private final SimpleService simpleService;

    @GetMapping("/simple-by-mybatis")
    public SimpleDto getSimpleByMybatis(@RequestParam String id) {
        SimpleDto simple = simpleService.getSimpleByMybatis(id);
        return simple;
    }

    @GetMapping("/simple-by-jpa")
    public SimpleDto getSimpleNyJpa(@RequestParam String id) {
        SimpleDto simple = simpleService.getSimpleByJpa(id);
        return simple;
    }
}
