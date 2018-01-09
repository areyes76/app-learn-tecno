/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.service;

import cl.app.beneficio.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * Implementacion del Servicio generico para la entidad del sistema.
 * 
 * @author areyesgaray
 *
 */
@Service("addressService")
public class AddressServiceImpl extends AbstractServiceImpl implements AddressService{

    @Override
    public Address persist(Address object) {
        try{
            return this.addressRepository.save(object);
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException persist " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception persist " + object.toString(), e);
        }
        return null;
    }

    @Override
    public void delete(Address object) {
        try{
            this.addressRepository.delete(object.getId());
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException delete " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception delete " + object.toString(), e);
            
        }
    }

    @Override
    public Address find(Address object) {
        try{
           return this.addressRepository.findOne(object.getId());
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException find " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception find " + object.toString(), e);            
        }
        return null;
    }

    @Override
    public List<Address> findAll() {
        try{
            return this.addressRepository.findAll();
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException findAll ",e);
        }catch(Exception e){
            logger.error("ERROR Exception findAll ", e);
        }
        return null;
    }
    
}
