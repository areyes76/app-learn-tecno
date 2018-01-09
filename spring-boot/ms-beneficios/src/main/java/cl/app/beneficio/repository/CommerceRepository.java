/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.repository;

import cl.app.beneficio.model.Commerce;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author areyesgaray
 */
@RepositoryRestResource(collectionResourceRel = "commerce", path = "commerce")
public interface CommerceRepository extends MongoRepository<Commerce,String>{
    
}
