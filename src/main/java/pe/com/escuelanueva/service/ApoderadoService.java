/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.ApoderadoEntity;

/**
 *
 * @author lisbet
 */
public interface ApoderadoService {
    
    List<ApoderadoEntity> findAll(); 
 List<ApoderadoEntity> findAllCustom(); 
    Optional<ApoderadoEntity> findById(Long id); 
    ApoderadoEntity add(ApoderadoEntity d); 
 ApoderadoEntity update(ApoderadoEntity d); 
 ApoderadoEntity delete(ApoderadoEntity d); 
}
