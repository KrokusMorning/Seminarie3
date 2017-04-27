package main.java.model;

/**
 * Created by ocean on 2017-04-27.
 */
public class Inspection {
    private final Vehicle vehicle;
    private final InspectionChecklist inspections;

    public Inspection(Vehicle vehicle, InspectionChecklist insList) {
        this.vehicle = vehicle;
        this.inspections = insList;
    }
    public int calculateCost(){
        int cost = inspections.getCostA() + inspections.getCostB() + inspections.getCostC();
        return cost;
    }
}
