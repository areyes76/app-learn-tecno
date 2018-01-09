/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.service;

import cl.app.beneficio.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * Implementacion del Servicio generico para la entidad del sistema.
 * 
 * @author areyesgaray
 *
 */
@Service("categoryService")
public class CategoryServiceImpl extends AbstractServiceImpl implements CategoryService{

    @Override
    public Category persist(Category object) {
        try{
            return this.categoryRepository.save(object);
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException persist " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception persist " + object.toString(), e);
        }
        return null;
    }

    @Override
    public void delete(Category object) {
        try{
            this.categoryRepository.delete(object.getId());
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException delete " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception delete " + object.toString(), e);
            
        }
    }

    @Override
    public Category find(Category object) {
        try{
           return this.categoryRepository.findOne(object.getId());
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException find " + object.toString(), e);
        }catch(Exception e){
            logger.error("ERROR Exception find " + object.toString(), e);            
        }
        return null;
    }

    @Override
    public List<Category> findAll() {
        try{
            return this.categoryRepository.findAll();
        }catch(UnsupportedOperationException e){
            logger.error("ERROR UnsupportedOperationException findAll ",e);
        }catch(Exception e){
            logger.error("ERROR Exception findAll ", e);
        }
        return null;
    }
    
}
