package pe.com.escuelanueva.rescontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.entity.ParentescoEntity;
import pe.com.escuelanueva.service.ParentescoService;
 @RestController
    @RequestMapping("/parentesco")
public class PaterentescoController {

        @Autowired
        private ParentescoService service;

        //@GetMapping --> permite obtener valores
        @GetMapping
        public List<ParentescoEntity> findAll() {
            return service.findAll();
        }

        @GetMapping("/custom")
        public List<ParentescoEntity> finAllCustom() {
            return service.findAllCustom();
        }

        @GetMapping("/{id}")
        public Optional<ParentescoEntity> finById(@PathVariable long id) {
            return service.findById(id);
        }

        @PostMapping
        public ParentescoEntity add(@RequestBody ParentescoEntity p) {
            return service.add(p);
        }

        @PutMapping("/{id}")
        public ParentescoEntity update(@PathVariable long id,@RequestBody ParentescoEntity p) {
            p.setCodigo(id);
            return service.update(p);
        }

        @DeleteMapping("/{id}")
        public ParentescoEntity delete(@PathVariable long id) {
            ParentescoEntity objcategoria = new ParentescoEntity();
            objcategoria.setEstado(false);
            return service.delete(ParentescoEntity.builder().codigo(id).build());

        }
    }
