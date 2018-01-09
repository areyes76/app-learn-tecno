package cl.app.beneficio.controller;

import java.sql.Timestamp;
import java.util.List;
import javax.validation.Valid;

import cl.app.beneficio.model.Benefit;
import cl.app.beneficio.NotFoundException;
import cl.app.beneficio.model.Request;
import cl.app.beneficio.service.BenefitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author areyesgaray
 */
@RestController
@RequestMapping("/LocationDataManagement/v1.0/benefits")
public class BenefitController {
	private static final Logger Logger = LoggerFactory.getLogger(BenefitController.class);

	@Autowired
	private BenefitService service;

	// ***************************************************************//
	// OPERACIONES PARA BENEFICIOS //
	// *************************************************************//
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Benefit create(@RequestBody @Valid Request object) {// ok
		try {
			Benefit benefit = object.getBenefit();
			return service.persist(benefit);

		} catch (Exception e) {
			Logger.error("ERROR CREANDO OBJETO ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "admin/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Benefit create(@RequestBody Benefit object) {// ok
		try {
			return service.persist(object);
		} catch (Exception e) {
			Logger.error("ERROR CREANDO OBJETO ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Benefit delete(@PathVariable("id") String id,@RequestParam("channelId") int channelId,@RequestParam("application") String application,
			@RequestParam("transactionId") int transactionId,@RequestParam("timeStamp") Timestamp timeStamp) {// ok
		try {
			service.delete(new Benefit(id));
		} catch (Exception e) {
			Logger.error("ERROR ELIMINANDO OBJETO ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "admin/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Benefit delete(@PathVariable("id") String id) {// ok
		try {
			service.delete(new Benefit(id));
		} catch (Exception e) {
			Logger.error("ERROR ELIMINANDO OBJETO ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public @ResponseBody List<Benefit> findAll(@RequestParam("channelId") int channelId, @RequestParam("application") String application,
						  @RequestParam("transactionId") int transactionId, @RequestParam("timeStamp") Timestamp timeStamp) {// ok
		try {
			return service.findAll();
		} catch (Exception e) {
			Logger.error("ERROR CARGANDO TODOS LOS OBJETOS ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "admin/findAll", method = RequestMethod.GET)
	public @ResponseBody List<Benefit> findAll() {// ok
		try {
			return service.findAll();
		} catch (Exception e) {
			Logger.error("ERROR CARGANDO TODOS LOS OBJETOS ....." + e.getMessage(), e);
		}
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Benefit findById(@PathVariable("id") String id,@RequestParam("channelId") int channelId,@RequestParam("application") String application,
			@RequestParam("transactionId") int transactionId,@RequestParam("timeStamp") Timestamp timeStamp) throws NotFoundException {// ok
		try {

			Benefit benefit = service.find(new Benefit(id));
			if (benefit.getId() == null || benefit.getId().equals("")) {
				throw new NotFoundException(id);
			}
			
			return benefit;
		} catch (Exception e) {
			Logger.error("ERROR BUSCANDO OBJETO....." + e.getMessage(), e);
			throw new NotFoundException(id);
		}	
	}

	@RequestMapping(value = "admin/{id}", method = RequestMethod.GET)
	public @ResponseBody Benefit findById(@PathVariable("id") String id) throws NotFoundException {// ok
		try {
			Benefit benefit = service.find(new Benefit(id));
			if (benefit.getId() == null || benefit.getId().equals("")) {
				throw new NotFoundException(id);
			}
			return benefit;
		} catch (Exception e) {
			Logger.error("ERROR BUSCANDO OBJETO....." + e.getMessage(), e);
			throw new NotFoundException(id);
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public @ResponseBody Benefit update(@RequestBody @Valid Request object) {// ok
		try {
			service.find(object.getBenefit());
			return service.persist(object.getBenefit());
		} catch (Exception e) {
			Logger.error("ERROR ACTUALIZANDO OBJETO ....." + e.getMessage(), e);
		}
		return object.getBenefit();
	}

	@RequestMapping(value = "admin/update", method = RequestMethod.PUT)
	public @ResponseBody Benefit update(@RequestBody Benefit object) {// ok
		try {
			return service.persist(object);
		} catch (Exception e) {
			Logger.error("ERROR ACTUALIZANDO OBJETO ....." + e.getMessage(), e);
		}
		return object;
	}

	@RequestMapping("/layout")
	public String getBenefitPartialPage(ModelMap modelMap) {
		return "benefits/layout";
	}

}
