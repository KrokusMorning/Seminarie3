package main.java.model;

/**
 * Class representing a checklist for what inspections are passed(true) or not passed(false).
 */
public class InspectionChecklist {
    private final Vehicle vehicle;
    private  boolean inspectionA = false;
    private  boolean inspectionB = false;
    private  boolean inspectionC = false;
    private  int cost;

    /**
     *
     * @return the cost for all inspections.
     */
    public int getCost() {
        return cost;
    }

    /**
     *
     * @param cost for all inspections.
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     *
     * @return the vehicle being inspected.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     *
     * @return result for <code>inspectionA</code>.
     */
    public boolean isInspectionA() {
        return inspectionA;
    }

    /**
     *
     * @return result for <code>inspectionB</code>.
     */
    public boolean isInspectionB() {
        return inspectionB;
    }

    /**
     *
     * @return result for <code>inspectionC</code>.
     */
    public boolean isInspectionC() {
        return inspectionC;
    }

    /**
     * Creates a new inspection checklist for a specific vehicle.
     * @param vehicle vehicle being inspected.
     */
    public InspectionChecklist(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     *
     * @param inspectionA specified inspection result.
     */
    public void setInspectionA(boolean inspectionA) {
        this.inspectionA = inspectionA;
    }

    /**
     *
     * @param inspectionB specified inspection result.
     */
    public void setInspectionB(boolean inspectionB) {
        this.inspectionB = inspectionB;
    }

    /**
     *
     * @param inspectionC specified inspection result.
     */
    public void setInspectionC(boolean inspectionC) {
        this.inspectionC = inspectionC;
    }




}
