package com.whw.service.impl;

import com.whw.domain.Customer;
import com.whw.mapper.CustomerMapper;
import com.whw.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void save(Customer customer) {
        customerMapper.save(customer);

    }
}
