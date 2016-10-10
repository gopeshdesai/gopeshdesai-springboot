package com.gopeshdesai.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created by gopeshdesai on 10/8/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Example {

    public static void main(String args[]) {
        SpringApplication.run(Example.class, args);
    }


}
