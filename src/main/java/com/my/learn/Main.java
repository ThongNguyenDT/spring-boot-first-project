package com.my.learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository repository){
        return args -> {
            Customer customer = new Customer(
                    "thong",
                    "thong1234@mail.com",
                    22
            );
            repository.insert(customer);
        };
    }
}
