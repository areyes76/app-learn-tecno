/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.service;

import java.util.List;

import cl.app.beneficio.model.Benefit;
import org.springframework.stereotype.Service;

/**
 * 
 * Implementacion del Servicio generico para la entidad del sistema.
 * 
 * @author areyesgaray
 *
 */
@Service("benefitService")
public class BenefitServiceImpl extends AbstractServiceImpl implements BenefitService{

    @Override
    public Benefit persist(Benefit object) {
        try{
            return this.beneficioRepository.save(object);
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException persist " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception persist " + object.toString(), e);
        }
        return null;
    }

    @Override
    public void delete(Benefit object) {
        try{
            this.beneficioRepository.delete(object.getId());
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException delete " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception delete " + object.toString(), e);
            
        }
    }

    @Override
    public Benefit find(Benefit object) {
        try{
           return this.beneficioRepository.findOne(object.getId());
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException find " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception find " + object.toString(), e);            
        }
        return null;
    }

    @Override
    public List<Benefit> findAll() {
        try{
            return this.beneficioRepository.findAll();
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException findAll ",e);
        }catch(Exception e){
            logger.error("ERROR Exception findAll ", e);
        }
        return null;
    }
    
}
