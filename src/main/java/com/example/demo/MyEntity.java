package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MyEntity")
public class MyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long myId;

    @Column
    private String name;

    public MyEntity() {
    }

    public long getMyId() {
        return myId;
    }

    public void setMyId(final long myId) {
        this.myId = myId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
