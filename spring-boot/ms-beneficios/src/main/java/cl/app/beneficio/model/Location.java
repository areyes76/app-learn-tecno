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
public class Location {
    private double[] coordinates;
    private String type;
    private double distance;

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Location{" + "coordinates=" + coordinates + ", type=" + type + ", distance=" + distance + '}';
    }
    
}
