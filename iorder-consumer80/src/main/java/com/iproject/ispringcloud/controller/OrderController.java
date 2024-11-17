package com.iproject.ispringcloud.controller;

import com.iproject.ispringcloud.constant.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/create")
    public String createOrder() {
        restTemplate.postForEntity(Constant.PAYMENT_URL + "/payment/create", "", String.class);
        return "create order...";
    }


    @GetMapping("/get/{id}")
    public String getOrder(@PathVariable("id") String id) {
        ResponseEntity<String> forEntity = restTemplate.getForEntity(Constant.PAYMENT_URL + "/payment/get/" + id, String.class);
        return forEntity.getBody();
    }
}
