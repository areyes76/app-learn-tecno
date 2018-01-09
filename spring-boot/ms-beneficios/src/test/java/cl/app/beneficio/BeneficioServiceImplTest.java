package cl.app.beneficio;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cl.app.beneficio.model.Address;
import cl.app.beneficio.model.Benefit;
import cl.app.beneficio.service.BenefitService;
import cl.app.beneficio.model.Lobby;
import cl.app.beneficio.model.Location;

/**
 * @author Petri Kainulainen
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
@AutoConfigureMockMvc
public class BeneficioServiceImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeneficioServiceImplTest.class);
    
    @Autowired
    private BenefitService service;
    //private BeneficioRepository repository;

    @Test
    public void testBeneficio(){
        this.create();
        //this.show();
    }
           
    /**
     * Metodo que permite ingresar Objetos Beneficios al sistema
     */
    public void create() {
        for(int i=0; i< 50; i++){
            long id = (new Date()).getTime();
            Benefit newBeneficio = new Benefit();
            newBeneficio.setId(""+id);           
            newBeneficio.setCategory("almacenes "+id);
            newBeneficio.setDescription("description "+id);
            newBeneficio.setDiscount(i);
            newBeneficio.setStart_date("start_date "+id);
            newBeneficio.setEnd_date("end_date "+id);
            newBeneficio.setReview("review "+id);
            newBeneficio.setTitle("title "+id);
            newBeneficio.setLogo("logo "+id);
            newBeneficio.setTwitter("twitter "+id);
            newBeneficio.setFacebook("facebook "+id);
            newBeneficio.setUrl("url "+ id);
            
            Address address = new Address();
            address.setCity("Santiago "+ id);
            address.setCountry("Santiago "+ id);
            address.setLine_1("Linea 1 "+ id);
            address.setLine_2("Linea 2 "+ id);
            address.setLine_3("Linea 3 "+ id);
            address.setPostcode("" + id);
            address.setState("Region Metropolitana "+ id);
            
            Location location = new Location();
            double[] cordenadas = {-77.99283,-33.9980};
            location.setCoordinates(cordenadas);
            location.setDistance(5.445);
            location.setType("Point");
            
            Lobby lobby = new Lobby();
            lobby.setHours("HORA "+ + id);
            
            newBeneficio = service.persist(newBeneficio);
            LOGGER.info(newBeneficio.toString());
        }
    }
    
    /**
     * Metodo que permite mostrar los objetos existentes en el sistema
     */
    public void show() {
        List<Benefit> listBeneficio = service.findAll();
        if(listBeneficio!=null && !listBeneficio.isEmpty()){
            for(Benefit c: listBeneficio){
                LOGGER.info(c.toString());
            }
        }
    }
    
}
