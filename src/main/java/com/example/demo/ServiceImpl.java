package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceMyEntity {
    @Autowired
    MyEntityRepository repo;

    @Override
    public void save(final MyEntity myEntity) {
        repo.save(myEntity);
    }

    @Override
    public List<MyEntity> getEntity() {
        return repo.findAll();
    }

}
