package com.demo.interfaces;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author cry777
 * @program demo1
 * @description
 * @create 2022-01-27
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class).run(args);
    }
}
