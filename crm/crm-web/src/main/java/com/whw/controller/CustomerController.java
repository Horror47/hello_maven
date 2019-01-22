package com.whw.controller;

import com.whw.domain.Customer;
import com.whw.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * 跳转到input.jsp
     */
    @RequestMapping("/input")
    public String input(){
        return "input";
    }


    /**
     * 保存
     */
    @RequestMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "succ";
    }

}
