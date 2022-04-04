package ar.com.eldars.dao;

import ar.com.eldars.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long> {
    
}
