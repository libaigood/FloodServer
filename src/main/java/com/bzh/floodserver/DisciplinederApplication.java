package com.bzh.floodserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.bzh.floodserver.mapper") //扫描mapper
@EnableTransactionManagement //开启事务
@SpringBootApplication
public class DisciplinederApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DisciplinederApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(DisciplinederApplication.class);
    }
}
