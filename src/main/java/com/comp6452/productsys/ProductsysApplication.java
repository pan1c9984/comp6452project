package com.comp6452.productsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"com.comp6452.productsys.mapper"})
public class ProductsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsysApplication.class, args);
    }

}
