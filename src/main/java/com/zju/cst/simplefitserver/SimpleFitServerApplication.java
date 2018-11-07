package com.zju.cst.simplefitserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.zju.cst.simplefitserver.dao.mapper")
public class SimpleFitServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleFitServerApplication.class, args);
    }
}
