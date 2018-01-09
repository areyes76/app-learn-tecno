package cl.app.beneficio.controller;

import cl.app.beneficio.NotFoundException;
import cl.app.beneficio.model.Category;
import cl.app.beneficio.model.Request;
import cl.app.beneficio.service.CategoryService;
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
@RequestMapping("/LocationDataManagement/v1.0/categorys")
public class CategoryController {
	private static final Logger Logger = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	private CategoryService service;

	// ***************************************************************//
	// OPERACIONES PARA BENEFICIOS //
	// *************************************************************//
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
    Category create(@RequestBody @Valid Category object) {// ok
		try {
			return service.persist(object);

		} catch (Exception e) {
			Logger.error("ERROR CREANDO OBJETO ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	Category delete(@PathVariable("id") String id) {// ok
		try {
			service.delete(new Category(id));
		} catch (Exception e) {
			Logger.error("ERROR ELIMINANDO OBJETO ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<Category> findAll() {// ok
		try {
			return service.findAll();
		} catch (Exception e) {
			Logger.error("ERROR CARGANDO TODOS LOS OBJETOS ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	Category findById(@PathVariable("id") String id) throws NotFoundException {// ok
		try {

			Category object = service.find(new Category(id));
			if (object.getId() == null || object.getId().equals("")) {
				throw new NotFoundException(id);
			}
			
			return object;
		} catch (Exception e) {
			Logger.error("ERROR BUSCANDO OBJETO....." + e.getMessage(), e);
			throw new NotFoundException(id);
		}	
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	Category update(@RequestBody @Valid Category object) {// ok
		try {
			return service.persist(object);
		} catch (Exception e) {
			Logger.error("ERROR ACTUALIZANDO OBJETO ....." + e.getMessage(), e);
		}
		return object;
	}

	@RequestMapping("/layout")
	public String getCategoryPartialPage(ModelMap modelMap) {
		return "categorys/layout";
	}

}
