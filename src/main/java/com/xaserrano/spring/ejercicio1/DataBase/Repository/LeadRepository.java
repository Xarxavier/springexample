package com.xaserrano.spring.ejercicio1.DataBase.Repository;

import com.xaserrano.spring.ejercicio1.DataBase.Entities.Entity_Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Entity_Lead,Integer> {

}
