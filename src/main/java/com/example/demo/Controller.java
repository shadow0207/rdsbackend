package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ServiceMyEntity service;

    @PostMapping("/myentity/save")
    public MyEntity saveAndGetMyEntity(@RequestBody final MyEntity entity) {
        service.save(entity);
        return entity;
    }

    @GetMapping("/myentity/get")
    public List<MyEntity> getMyEntity() {
        return service.getEntity();
    }

}
