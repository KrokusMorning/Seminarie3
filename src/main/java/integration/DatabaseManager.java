package main.java.integration;

import main.java.model.InspectionChecklist;
import main.java.model.Vehicle;
import main.java.model.InspectionResults;

/**
 * Created by ocean on 2017-04-27.
 */
public class DatabaseManager {
    private Printer PRTR;

    public DatabaseManager(Printer PRTR) {
        this.PRTR = PRTR;
    }

    public  InspectionChecklist findInspectionsByVehicle(Vehicle vehicle){
        InspectionChecklist inspections = new InspectionChecklist(vehicle);
        return inspections;
    }

    public void updateSpecResult(boolean specInspectionResult, InspectionChecklist inspections, Vehicle vehicle){
        if(vehicle.getRegNo() == inspections.getVehicle().getRegNo()){
        if(!inspections.isInspectionA()){
            inspections.setInspectionA(specInspectionResult);
            return;}
        if(!inspections.isInspectionB()){
            inspections.setInspectionB(specInspectionResult);
            return;}
        if(!inspections.isInspectionC()){
            inspections.setInspectionC(specInspectionResult);
            return;}}
    }

    public void inspectionsCompleted(Vehicle vehicle, InspectionChecklist inspections){
        InspectionResults insRes = new InspectionResults(vehicle, inspections);
        PRTR.printInspectionResults(insRes);
    }

    }
