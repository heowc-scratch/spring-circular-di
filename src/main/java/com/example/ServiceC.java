package com.example;

import org.springframework.stereotype.Service;

@Service
public class ServiceC {

    private ServiceA service;

//    public ServiceC(ServiceA service) {
//        this.service = service;
//    }

    public void setService(ServiceA service) {
        this.service = service;
    }
}
