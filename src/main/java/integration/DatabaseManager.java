package main.java.integration;

import main.java.model.InspectionChecklist;
import main.java.model.Vehicle;
import main.java.model.InspectionResults;

/**
 * Class responsible for database calls.
 */
public class DatabaseManager {
    private Printer PRTR;

    /**
     * Creates a new instance.
     *
     * @param PRTR  Printer to be used.
     */
    public DatabaseManager(Printer PRTR) {
        this.PRTR = PRTR;
    }

    /**
     *
     * @param vehicle The vehicle being inspected.
     * @return  Checklist telling what inspections to be done and which are done-
     */
    public  InspectionChecklist findInspectionsByVehicle(Vehicle vehicle){
        InspectionChecklist checklist = new InspectionChecklist(vehicle);
        return checklist;
    }

    /** Checks that checklist of the correct vehicle is being updated and
     * updates the <code>InspectionChecklist</code> with result for the specified inspection.
     *
     * @param specInspectionResult
     * @param checklist Checklist telling what inspections to be done and which are done.
     * @param vehicle The vehicle being inspected.
     */
    public void updateSpecResult(boolean specInspectionResult, InspectionChecklist checklist, Vehicle vehicle){
        if(vehicle.getRegNo().equals(checklist.getVehicle().getRegNo())){
        if(!checklist.isInspectionA()){
            checklist.setInspectionA(specInspectionResult);
            return;}
        if(!checklist.isInspectionB()){
            checklist.setInspectionB(specInspectionResult);
            return;}
        if(!checklist.isInspectionC()){
            checklist.setInspectionC(specInspectionResult);
            return;}}
    }

    /**
     * Creates a final inspection result and prints it.
     *
     * @param vehicle The vehicle being inspected.
     * @param checklist Checklist telling what inspections to be done and which are done.
     */
    public void inspectionsCompleted(Vehicle vehicle, InspectionChecklist checklist){
        InspectionResults insRes = new InspectionResults(vehicle, checklist);
        PRTR.printInspectionResults(insRes);
    }

    }
