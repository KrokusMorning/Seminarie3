package main.java.model;

/**
 * Created by ocean on 2017-04-27.
 */
public class InspectionChecklist {
    private final Vehicle vehicle;
    private final int costA = 10;
    private final int costB = 20;
    private final int costC = 30;

    public InspectionChecklist(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getCostA() {
        return costA;
    }

    public int getCostB() {
        return costB;
    }

    public int getCostC() {
        return costC;
    }
}
