/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.service;

import cl.app.beneficio.model.Commerce;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * Implementacion del Servicio generico para la entidad del sistema.
 * 
 * @author areyesgaray
 *
 */
@Service("commerceService")
public class CommerceServiceImpl extends AbstractServiceImpl implements CommerceService{

    @Override
    public Commerce persist(Commerce object) {
        try{
            return this.commerceRepository.save(object);
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException persist " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception persist " + object.toString(), e);
        }
        return null;
    }

    @Override
    public void delete(Commerce object) {
        try{
            this.commerceRepository.delete(object.getId());
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException delete " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception delete " + object.toString(), e);
            
        }
    }

    @Override
    public Commerce find(Commerce object) {
        try{
           return this.commerceRepository.findOne(object.getId());
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException find " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception find " + object.toString(), e);            
        }
        return null;
    }

    @Override
    public List<Commerce> findAll() {
        try{
            return this.commerceRepository.findAll();
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException findAll ",e);
        }catch(Exception e){
            logger.error("ERROR Exception findAll ", e);
        }
        return null;
    }
    
}
