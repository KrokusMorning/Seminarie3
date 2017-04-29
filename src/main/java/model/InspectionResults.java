package main.java.model;

/**
 * Created by ocean on 2017-04-29.
 */
public class InspectionResults {
    private final Vehicle vehicle;
    private String inspectionA = "FAIL";
    private String inspectionB = "FAIL";
    private String inspectionC = "FAIL";

    public Vehicle getVehicle() {
        return vehicle;
    }

    public InspectionResults(Vehicle vehicle, InspectionChecklist inspections) {
        this.vehicle = vehicle;
        if(inspections.isInspectionA())
            this.inspectionA = "PASS";
        if(inspections.isInspectionB())
            this.inspectionB = "PASS";
        if(inspections.isInspectionC())
            this.inspectionC = "PASS";
    }

    public String getInspectionA() {
        return inspectionA;
    }

    public String getInspectionB() {
        return inspectionB;
    }

    public String getInspectionC() {
        return inspectionC;
    }


}
