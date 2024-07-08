package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadSampleData {

    private static final Logger log = LoggerFactory.getLogger(LoadSampleData.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new User("Adam", "Smith", "adam.s@gmail.com", "Australia")));
            log.info("Preloading " + repository.save(new User("Stephen", "Curry", "stephen.c@outlook.com", "Spain")));
        };
    }

}
