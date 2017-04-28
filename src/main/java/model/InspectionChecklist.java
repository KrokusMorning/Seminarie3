package main.java.model;

/**
 * Created by ocean on 2017-04-27.
 */
public class InspectionChecklist {
    private final Vehicle vehicle;
    private  boolean inspectionA = false;
    private  boolean inspectionB = false;
    private  boolean inspectionC = false;

    public boolean isInspectionA() {
        return inspectionA;
    }

    public boolean isInspectionB() {
        return inspectionB;
    }

    public boolean isInspectionC() {
        return inspectionC;
    }

    public InspectionChecklist(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setInspectionA(boolean inspectionA) {
        this.inspectionA = inspectionA;
    }

    public void setInspectionB(boolean inspectionB) {
        this.inspectionB = inspectionB;
    }

    public void setInspectionC(boolean inspectionC) {
        this.inspectionC = inspectionC;
    }




}
