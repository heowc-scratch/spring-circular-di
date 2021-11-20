package com.example;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    private final ServiceB service;

    public ServiceA(ServiceB service) {
        this.service = service;
    }
}
