package com.hello.spring.data.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @Column(name = "id")
    private int id;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                '}';
    }
}
