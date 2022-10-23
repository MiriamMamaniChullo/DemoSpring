package pe.edu.upc.demospring.serviceinterfaces;

import pe.edu.upc.demospring.entities.Propietario;

import java.util.List;

public interface IPropietarioService {

    public void insert(Propietario propietario);
    List<Propietario>list();
    public void delete(int idPropietario);
    List<Propietario> search(String namePropietario);

}
