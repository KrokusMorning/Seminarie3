package main.java.model;

/**
 * Class representing an inspection of a vehicle.
 */
public class Inspection {
    private final Vehicle vehicle;
    private final InspectionChecklist inspections;

    /**
     * Creates a new instance representing an inspection of a vehicle.
     *
     * @param vehicle The vehicle being inspected.
     * @param checklist Checklist telling what inspections to be done and which are done.
     */
    public Inspection(Vehicle vehicle, InspectionChecklist checklist) {
        this.vehicle = vehicle;
        this.inspections = checklist;
    }

    /**
     * Calculates the cost for all inspections necessary for the specific vehicle. Then updates
     * the vehicles checklist with the cost.
     * @param vehicle The vehicle being inspected.
     *
     */

    public void calculateCost(Vehicle vehicle){
        int cost = 0;
        if(vehicle.getRegNo().equals(this.vehicle.getRegNo())){
            if (!inspections.isInspectionA())
                cost += 10;
            if (!inspections.isInspectionB())
                cost += 15;
            if (!inspections.isInspectionC())
                cost += 20;
        }
        inspections.setCost(cost);
    }
}
