package com.greencacti.service;

import com.greencacti.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by baominw on 4/6/17.
 */
@RestController("/config")
public class ConfigController {
    private Config config;

    @Autowired
    public ConfigController(Config config) {
        this.config = config;
    }

    @RequestMapping("/config/show")
    String showConfig() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company: \n");
        sb.append(config.getName());
        sb.append("\n");
        sb.append("Department:\n");
        sb.append(config.getDepartment().getName());
        sb.append("\n");
        for(String employee: config.getDepartment().getEmployees()) {
            sb.append(employee);
            sb.append("\n");
        }
        return sb.toString();
    }
}
