package com.example;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    private final ServiceC service;

    public ServiceB(ServiceC service) {
        this.service = service;
    }
}
