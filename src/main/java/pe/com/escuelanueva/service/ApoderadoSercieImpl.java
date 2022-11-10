/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.escuelanueva.service;

/**
 *
 * @author lisbet
 */
import java.util.List; 
import java.util.Optional; 
import org.springframework.beans.BeanUtils; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import pe.com.escuelanueva.entity.ApoderadoEntity; 
import pe.com.escuelanueva.repository.ApoderadoRepository; 
@Service
public class ApoderadoSercieImpl implements ApoderadoService { 
 @Autowired
 private ApoderadoRepository repositorioapoderado; 
 @Override
 public List<ApoderadoEntity> findAll() { 
 return repositorioapoderado.findAll(); 
 } 
 @Override
 public List<ApoderadoEntity> findAllCustom() { 
 return repositorioapoderado.findAllCustom(); 
 } 
 @Override
 public Optional<ApoderadoEntity> findById(Long id) { 
 return repositorioapoderado.findById(id); 
 } 
 @Override
 public ApoderadoEntity add(ApoderadoEntity a) { 
 return repositorioapoderado.save(a); 
 } 
 @Override
 public ApoderadoEntity update(ApoderadoEntity a) { 
 ApoderadoEntity objapoderado= repositorioapoderado.getById(a.getCodigo()); 
 BeanUtils.copyProperties(a, objapoderado); 
 return repositorioapoderado.save(objapoderado); 
} 
 @Override
 public ApoderadoEntity delete(ApoderadoEntity a) { 
 ApoderadoEntity objapoderado= repositorioapoderado.getById(a.getCodigo()); 
 objapoderado.setEstado(false); 
 return repositorioapoderado.save(objapoderado); 
 } 
}