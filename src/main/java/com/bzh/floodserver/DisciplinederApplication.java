package com.bzh.floodserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.bzh.floodserver.mapper")
@EnableTransactionManagement //开启事务
@SpringBootApplication
public class DisciplinederApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisciplinederApplication.class, args);
    }
}
