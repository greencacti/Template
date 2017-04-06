package com.greencacti.domain;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by baominw on 4/6/17.
 */
@Entity
public class Person  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String uuid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
