package main.java.controller;

import main.java.model.Vehicle;

/**
 * Created by ocean on 2017-04-27.
 */
public class Controller {
    public int enterRegistrationNumber( String regNo ){
        Vehicle vehicle = new Vehicle(regNo);
    }
}
