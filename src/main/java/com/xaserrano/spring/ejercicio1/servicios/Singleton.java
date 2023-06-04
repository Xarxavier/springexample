package com.xaserrano.spring.ejercicio1.servicios;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Scope("singleton")
public class Singleton {
    public String Guid = UUID.randomUUID().toString();
}
