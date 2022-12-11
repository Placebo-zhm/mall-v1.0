package com.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.java1234.mapper")
public class MallV1Application {

    public static void main(String[] args) {
        SpringApplication.run(MallV1Application.class, args);
    }

}
