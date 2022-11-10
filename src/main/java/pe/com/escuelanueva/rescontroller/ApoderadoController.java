package pe.com.escuelanueva.rescontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.entity.ApoderadoEntity;
import pe.com.escuelanueva.service.ApoderadoService;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {

    @Autowired
    private ApoderadoService servicio;

    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<ApoderadoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<ApoderadoEntity> finAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<ApoderadoEntity> finById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public ApoderadoEntity add(@RequestBody ApoderadoEntity c) {
        return servicio.add(c);
    }

    @PutMapping("/{id}")
    public ApoderadoEntity update(@PathVariable long id, @RequestBody ApoderadoEntity c) {
        c.setCodigo(id);
        return servicio.update(c);
    }

    @DeleteMapping("/{id}")
    public ApoderadoEntity delete(@PathVariable long id) {
        ApoderadoEntity objcategoria = new ApoderadoEntity();
        objcategoria.setEstado(false);
        return servicio.delete(ApoderadoEntity.builder().codigo(id).build());

    }

}
