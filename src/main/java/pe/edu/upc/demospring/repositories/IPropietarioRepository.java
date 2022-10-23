package pe.edu.upc.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demospring.entities.Propietario;

import java.util.List;

@Repository
public interface IPropietarioRepository extends JpaRepository<Propietario,Integer> {

    @Query("from Propietario p where lower(p.namePropietario)=lower(:p.namePropietario) like %:namePropietario%")
    List<Propietario> buscarNombre(@Param ("namePropietario") String namePropietario);

}
