/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.escuelanueva.entity.DistritoEntity;
import pe.com.escuelanueva.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    private DistritoRepository repositoriodistrito;

    @Override
    public List<DistritoEntity> findAll() {
        return repositoriodistrito.findAll();
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return repositoriodistrito.findAllCustom();
    }

    @Override
    public Optional<DistritoEntity> findById(Long id) {
        return repositoriodistrito.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return repositoriodistrito.save(d);
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity objdistrito = repositoriodistrito.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return repositoriodistrito.save(objdistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity objdistrito = repositoriodistrito.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return repositoriodistrito.save(objdistrito);
    }
}
