package cl.app.beneficio.controller;

import cl.app.beneficio.NotFoundException;
import cl.app.beneficio.model.Commerce;
import cl.app.beneficio.model.Request;
import cl.app.beneficio.service.CommerceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author areyesgaray
 */
@RestController
@RequestMapping("/LocationDataManagement/v1.0/commerces")
public class CommerceController {
	private static final Logger Logger = LoggerFactory.getLogger(CommerceController.class);

	@Autowired
	private CommerceService service;

	// ***************************************************************//
	// OPERACIONES PARA BENEFICIOS //
	// *************************************************************//
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
    Commerce create(@RequestBody @Valid Commerce object) {// ok
		try {
			return service.persist(object);
		} catch (Exception e) {
			Logger.error("ERROR CREANDO OBJETO ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	Commerce delete(@PathVariable("id") String id) {// ok
		try {
			service.delete(new Commerce(id));
		} catch (Exception e) {
			Logger.error("ERROR ELIMINANDO OBJETO ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<Commerce> findAll() {// ok
		try {
			return service.findAll();
		} catch (Exception e) {
			Logger.error("ERROR CARGANDO TODOS LOS OBJETOS ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	Commerce findById(@PathVariable("id") String id) throws NotFoundException {// ok
		try {

			Commerce benefit = service.find(new Commerce(id));
			if (benefit.getId() == null || benefit.getId().equals("")) {
				throw new NotFoundException(id);
			}
			
			return benefit;
		} catch (Exception e) {
			Logger.error("ERROR BUSCANDO OBJETO....." + e.getMessage(), e);
			throw new NotFoundException(id);
		}	
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	Commerce update(@RequestBody @Valid Commerce object) {// ok
		try {
			return service.persist(object);
		} catch (Exception e) {
			Logger.error("ERROR ACTUALIZANDO OBJETO ....." + e.getMessage(), e);
		}
		return object;
	}


	@RequestMapping("/layout")
	public String getCommercePartialPage(ModelMap modelMap) {
		return "commerces/layout";
	}
}
