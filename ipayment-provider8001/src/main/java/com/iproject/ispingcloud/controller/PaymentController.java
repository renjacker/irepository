package com.iproject.ispingcloud.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/create")
    public String createPayment() {
        return "create payment...";
    }


    @GetMapping("/get/{id}")
    public String getPayment(@PathVariable("id") String id) {
        return "get payment...12313111111111 " + id;
    }

}
