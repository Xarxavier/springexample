package com.xaserrano.spring.ejercicio1.servicios;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Scope(value="request")
public class Trasient {
    public String Guid = UUID.randomUUID().toString();
}
