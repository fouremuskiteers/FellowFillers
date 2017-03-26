package com.mybasket.controller;

import com.mybasket.entities.Customer;
import com.mybasket.entities.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ssaha on 3/23/17.
 */
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    private final AtomicLong counter=new AtomicLong();
    
    @RequestMapping(value = "/register",method = RequestMethod.PUT)
    public boolean register(@RequestParam (value = "customer") Customer customer){
        return true;
    }
    


}
