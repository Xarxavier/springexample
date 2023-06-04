package com.xaserrano.spring.ejercicio1.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value="request")
public class MiService {
    @Autowired
    public Scoped scoped;
    @Autowired
    public Trasient trasient;

}
