package main.java.model;

/**
 * Class representing the final result of the inspection.
 * The results of all tests are presented and a final result is generated.
 */
public class InspectionResults {
    private final Vehicle vehicle;
    private String inspectionA = "FAIL";
    private String inspectionB = "FAIL";
    private String inspectionC = "FAIL";
    private String finalResult = "FAIL";


    /**
     *
     * @return  The vehicle whos results are on the checklist.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Reads the results from the specified inspections and creates an instance of <code>InspectionResults</code>
     * containing the results and generates a final result for the whole inspection.
     *
     * @param vehicle The vehicle being inspected.
     * @param checklist Checklist telling what inspections to be done and which are done.
     */
    public InspectionResults(Vehicle vehicle, InspectionChecklist checklist) {
        this.vehicle = vehicle;
        if(checklist.isInspectionA())
            this.inspectionA = "PASS";
        if(checklist.isInspectionB())
            this.inspectionB = "PASS";
        if(checklist.isInspectionC())
            this.inspectionC = "PASS";
        if(checklist.isInspectionA() && checklist.isInspectionB() && checklist.isInspectionC())
            this.finalResult = "PASS";
    }

    /**
     *
     * @return  Result for whole inspection.
     */
    public String getFinalResult() {
        return finalResult;
    }

    /**
     *
     * @return  result of <code>inspectionA</code>.
     */
    public String getInspectionA() {
        return inspectionA;
    }

    /**
     *
     * @return  result of <code>inspectionB</code>.
     */
    public String getInspectionB() {
        return inspectionB;
    }

    /**
     *
     * @return  result of <code>inspectionC</code>.
     */
    public String getInspectionC() {
        return inspectionC;
    }


}
