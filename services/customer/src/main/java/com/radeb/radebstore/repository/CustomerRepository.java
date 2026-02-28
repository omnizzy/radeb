package com.radeb.radebstore.repository;

import com.radeb.radebstore.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
