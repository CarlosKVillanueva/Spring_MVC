package ar.com.eldars.dao;

import ar.com.eldars.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository <Persona, Long> {
    
}
