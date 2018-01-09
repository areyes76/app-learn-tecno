/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author areyesgaray
 */
@Document
public class Lobby {
    private String hours;

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Lobby{" + "hours=" + hours + '}';
    }
    
    
}
