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
        int cost = 0;
        if (!inspections.isInspectionA())
            cost += 10;
        if (!inspections.isInspectionB())
            cost += 15;
        if (!inspections.isInspectionC())
            cost += 20;
        return cost;
    }
}
