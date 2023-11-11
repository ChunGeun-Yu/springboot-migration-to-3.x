package com.example.springboot.migration.service;

import com.example.springboot.migration.dto.SimpleDto;
import com.example.springboot.migration.entity.SimpleEntity;
import com.example.springboot.migration.mapper.SimpleMapper;
import com.example.springboot.migration.repository.SimpleRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


// migration
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.HashMap;

@Slf4j
@Service
@RequiredArgsConstructor
public class SimpleService {

    private final SimpleMapper simpleMapper;

    private final SimpleRepository simpleRepository;

    @PostConstruct
    public void init() {
        log.info("@PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        log.info("@PreDestroy");
    }

    public SimpleDto getSimpleByMybatis(String id) {

        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", id);
        HashMap<String, Object> resultMap = simpleMapper.selectSample(paramMap);
        log.info("resultMap: {}", resultMap);

        SimpleDto simpleDto = new SimpleDto();
        simpleDto.setId((String)resultMap.get("ID"));
        simpleDto.setName((String)resultMap.get("NAME"));

        return simpleDto;
    }

    public SimpleDto getSimpleByJpa(String id) {
        SimpleEntity simpleEntity = simpleRepository.findById(id).get();
        log.info("simpleEntity: {}", simpleEntity);

        SimpleDto simpleDto = new SimpleDto();
        simpleDto.setId(simpleEntity.getId());
        simpleDto.setName(simpleEntity.getName());

        return simpleDto;
    }
}
