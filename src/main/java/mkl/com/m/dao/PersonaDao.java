package mkl.com.m.dao;

import mkl.com.m.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonaDao extends JpaRepository<Persona, Long>{
    
    
}
