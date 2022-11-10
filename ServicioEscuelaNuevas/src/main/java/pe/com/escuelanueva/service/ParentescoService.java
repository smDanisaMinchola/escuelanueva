/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.ParentescoEntity;

/**
 *
 * @author lisbet
 */
public interface ParentescoService {
    
    List<ParentescoEntity>findAll(); 
 List<ParentescoEntity> findAllCustom(); 
    Optional<ParentescoEntity> findById(Long id); 
    ParentescoEntity add(ParentescoEntity p); 
 ParentescoEntity update(ParentescoEntity p); 
 ParentescoEntity delete(ParentescoEntity p); 

}
