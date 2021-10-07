package com.example.gameconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GameConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameConfigServiceApplication.class, args);
    }

}
