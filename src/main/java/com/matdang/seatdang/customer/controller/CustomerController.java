package com.matdang.seatdang.customer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class CustomerController {
    @GetMapping("/")
    public String index() {
        return "customer/main/main";
    }
}
