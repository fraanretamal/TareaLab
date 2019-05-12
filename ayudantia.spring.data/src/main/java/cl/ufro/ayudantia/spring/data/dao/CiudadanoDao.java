
package cl.ufro.ayudantia.spring.data.dao;
import cl.ufro.ayudantia.spring.data.modelo.Ciudadano;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="ciudadanos", collectionResourceRel="ciudadanos")
public interface CiudadanoDao extends CrudRepository<Ciudadano , Long> {
    @Override
    public List<Ciudadano>findAll();
  
    
    
    
}
