package main.java.integration;

import main.java.model.InspectionChecklist;
import main.java.model.Vehicle;

/**
 * Created by ocean on 2017-04-27.
 */
public class DatabaseManager {
    public  InspectionChecklist findInspectionsByVehicle(Vehicle vehicle){
        InspectionChecklist inspections = new InspectionChecklist(vehicle);
        return inspections;
    }


}
