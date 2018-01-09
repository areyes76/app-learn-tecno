/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.service;

import java.util.List;

/**
 * 
 * Interfaz para un Servicio generico que sirve como base para toda entidad del
 * sistema.
 * 
 * @author areyesgaray
 *
 * @param <T>
 */
public interface AbstractService<T> {
        /**
     * Hace persistente un objeto
     * @param object objeto que se desea persistir
     * @return de persistent object
     */
    T persist(T object);
    
    /**
     * Elimina un objeto
     * @param object el objeto que se desea eliminar
     */
    void delete(T object);
    
    /**
     * Encuentra un objeto a partir de su identificador unico
     * @param id identificador del objeto
     * @return el objeto encontado (null en caso de que no exista)
     */
    T find(T object);
    
    /**
     * Obtiene todos los objetos
     * @return lista de todos los objetos
     */
    List<T> findAll();
    
}
