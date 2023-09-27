package com.my.learn.repository;

import com.my.learn.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository
        extends MongoRepository<Customer, String> {

}
