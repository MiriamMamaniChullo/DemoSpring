package pe.edu.upc.demospring.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demospring.entities.Propietario;
import pe.edu.upc.demospring.repositories.IPropietarioRepository;
import pe.edu.upc.demospring.serviceinterfaces.IPropietarioService;

import java.util.List;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
    @Autowired
    private IPropietarioRepository pR;

    @Override
    public void insert(Propietario propietario) {
        pR.save(propietario);
    }

    @Override
    public List<Propietario> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPropietario) {
        pR.deleteById(idPropietario);
    }

    @Override
    public List<Propietario> search(String namePropietario) {
        return pR.buscarNombre(namePropietario);
    }
}
