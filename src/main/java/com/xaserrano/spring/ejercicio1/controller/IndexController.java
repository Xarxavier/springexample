package com.xaserrano.spring.ejercicio1.controller;

import com.xaserrano.spring.ejercicio1.servicios.MiService;
import com.xaserrano.spring.ejercicio1.servicios.Scoped;
import com.xaserrano.spring.ejercicio1.servicios.Singleton;
import com.xaserrano.spring.ejercicio1.servicios.Trasient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(value="request")
public class IndexController {
    @Autowired
    private Scoped scoped;
    @Autowired
    private Singleton singleton;
    @Autowired
    private Trasient trasient;
    @Autowired
    private MiService service;
    //@GetMapping, @PostMapping,
    @GetMapping({"/index"})
    public String index(){
        return  "singleton:" + singleton.Guid + "<br/>" +
                "scoped:"+ scoped.Guid + "<br/>" +
                "trasient:"+trasient.Guid + "<br/>" +
                "MiServicio:scoped:" + service.scoped.Guid +"<br/>" +
                "MiServicio:trasient" + service.trasient.Guid;


        //return "redirect:/uri" sirve para redireccionar.
    }
}
