package pe.edu.upc.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demospring.entities.Propietario;

@Repository
public interface IPropietarioRepository extends JpaRepository<Propietario,Integer> {

}
