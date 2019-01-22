package com.whw.controller;

import com.whw.domain.Customer;
import com.whw.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    /**
     * GET请求
     */
    @RequestMapping(value = "/doGet",method = RequestMethod.GET)
    public String doGet(){
        System.out.println("doGet...");
        return "succ";
    }

    /**
     * POST请求
     */
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doPost(Customer customer){
        System.out.println("doPost..." + customer);
        return "succ";
    }

    /**
     * DELETE请求
     */
    @RequestMapping(value = "/doDelete",method = RequestMethod.DELETE)
    public String doDelete(Integer id){
        System.out.println("doDelete..." + id);
        return "succ";
    }

    /**
     * PUT请求
     */
    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut...");
        return "succ";
    }

}
