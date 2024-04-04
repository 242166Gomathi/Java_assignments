package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableWebMvc
@SpringBootApplication
//@ComponentScan("org.example.config")
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}