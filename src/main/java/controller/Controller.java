package main.java.controller;

import main.java.integration.DatabaseManager;
import main.java.model.Inspection;
import main.java.model.InspectionChecklist;
import main.java.model.Vehicle;

/**
 * Created by ocean on 2017-04-27.
 */
public class Controller {
    private DatabaseManager dbMgr;

    public Controller(DatabaseManager dbMgr) {
        this.dbMgr = dbMgr;
    }

    public int enterRegistrationNumber( String regNo ){
        Vehicle vehicle = new Vehicle(regNo);
        InspectionChecklist inspections = dbMgr.findInspectionsByVehicle(vehicle);
        Inspection currentInspection = new Inspection(vehicle, inspections);
        int cost = currentInspection.calculateCost();
        return cost;

    }
}
