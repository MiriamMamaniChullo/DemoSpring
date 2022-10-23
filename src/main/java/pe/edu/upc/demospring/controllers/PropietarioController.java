package pe.edu.upc.demospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demospring.entities.Propietario;
import pe.edu.upc.demospring.serviceinterfaces.IPropietarioService;

import java.util.List;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {
    @Autowired
    private IPropietarioService pService;

    @PostMapping
    public void registrar(@RequestBody Propietario p) {
        pService.insert(p);
    }
    @GetMapping
    public List<Propietario> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pService.delete(id);}
    @PutMapping
    public void actualizar(@RequestBody Propietario p) {
        pService.insert(p);
    }
    @PostMapping("/buscar")
    public List<Propietario> buscar(@RequestBody Propietario p) {
        return pService.search(p.getNamePropietario());
    }
}
