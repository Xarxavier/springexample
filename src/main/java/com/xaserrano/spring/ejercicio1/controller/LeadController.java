package com.xaserrano.spring.ejercicio1.controller;

import com.xaserrano.spring.ejercicio1.DataBase.Entities.Entity_Lead;
import com.xaserrano.spring.ejercicio1.DataBase.Repository.LeadRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@Scope(value="request")
public class LeadController {
    private final LeadRepository leadRepo;

    public LeadController(LeadRepository leadRepo) {
        this.leadRepo = leadRepo;
    }

    @GetMapping({"/leads"})
    public List<Entity_Lead> Get(){
        return leadRepo.findAll();
    }
    @GetMapping({"/leads/{Id}"})
    public ResponseEntity<Entity_Lead> GetById(@PathVariable int Id){
        Optional<Entity_Lead> lead = leadRepo.findById(Id);
        return lead.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }
    @PostMapping("/leads")
    public ResponseEntity<Entity_Lead> createLead(@RequestBody Entity_Lead lead) throws URISyntaxException {
        Entity_Lead result = leadRepo.save(lead);
        return ResponseEntity.created(new URI("/leads/" + result.getId())).body(result);
    }
}
