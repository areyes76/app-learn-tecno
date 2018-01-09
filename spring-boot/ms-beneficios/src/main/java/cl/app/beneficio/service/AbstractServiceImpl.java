/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.service;

import cl.app.beneficio.repository.AddressRepository;
import cl.app.beneficio.repository.BenefitRepository;
import cl.app.beneficio.repository.CategoryRepository;
import cl.app.beneficio.repository.CommerceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author areyesgaray
 */
public class AbstractServiceImpl {
	
    protected static final Logger logger = LoggerFactory.getLogger(AbstractServiceImpl.class);
    
    @Autowired
    protected BenefitRepository beneficioRepository;
    @Autowired
    protected AddressRepository addressRepository;
    @Autowired
    protected CategoryRepository categoryRepository;
    @Autowired
    protected CommerceRepository commerceRepository;
}
