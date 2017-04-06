package com.greencacti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by baominw on 4/6/17.
 */
@SpringBootApplication
public class TemplateApplication {
    private static final Logger logger = LoggerFactory.getLogger(TemplateApplication.class);

    public static void main(String[] args){
        logger.debug("Template application is started.");
        SpringApplication.run(TemplateApplication.class, args);
    }
}
