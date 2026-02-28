package com.radeb.radebstore.service;

import com.radeb.radebstore.dto.CustomerRequest;
import com.radeb.radebstore.repository.CustomerRepository;
import com.radeb.radebstore.utils.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper mapper;
    public String createCustomer(CustomerRequest request) {
        return null;
    }
}
