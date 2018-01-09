/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.repository;


import cl.app.beneficio.model.Benefit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author areyesgaray
 */
@RepositoryRestResource(collectionResourceRel = "beneficio", path = "beneficio")
public interface BenefitRepository extends MongoRepository<Benefit,String>{
    
}
