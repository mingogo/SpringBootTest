package com.mteng;

import com.mteng.services.chainsOfResponsibility.TargetClient;
import com.mteng.services.chainsOfResponsibility.TargetProcessor;
import com.mteng.services.chainsOfResponsibility.handlers.FriendlyTargetHandler;
import com.mteng.services.chainsOfResponsibility.handlers.HostileTargetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
