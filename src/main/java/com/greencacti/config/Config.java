package com.greencacti.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baominw on 4/6/17.
 */
@Component
@ConfigurationProperties(prefix = "company")
public class Config {
    private String name;

    private final Department department = new Department();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public static class Department {
        private String name;

        private final List<String> employees = new ArrayList<String>();

        public String getName() {

            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getEmployees() {
            return employees;
        }
    }
}
