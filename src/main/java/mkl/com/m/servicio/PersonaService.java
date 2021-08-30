package mkl.com.m.servicio;

import java.util.List;
import mkl.com.m.domain.Persona;

public interface PersonaService {

    public List<Persona> listarPersonas();
    

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
