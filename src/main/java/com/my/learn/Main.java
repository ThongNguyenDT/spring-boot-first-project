package com.my.learn;

import com.my.learn.model.Customer;
import com.my.learn.repository.CustomerRepository;
import com.my.learn.utils.HelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    CustomerRepository repository;
    @Bean
    CommandLineRunner runner(){
        return args -> {
            List<Customer> customers = repository.findAll();

            if (customers.isEmpty())
                repository.saveAll(HelperUtil.CustomerSupplier.get());
        };
    }
}
