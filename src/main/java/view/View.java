package main.java.view;

import main.java.controller.Controller;
import main.java.model.InspectionChecklist;
import main.java.model.Vehicle;

import java.time.YearMonth;

/**
 * Created by ocean on 2017-04-27.
 */
public class View {
    private Controller contr;

    public View(Controller contr){
        this.contr = contr;

    }
    /**
     * Calls all system operations and prints the result to <code>System.out</code>.
     */
    public void sampleExecution() {
        contr.newInspection();
        contr.closeGarage();
        String regNo = "ABC123";
        Vehicle vehicle = new Vehicle(regNo);
        InspectionChecklist inspections = new InspectionChecklist(vehicle);
        int cost = contr.enterRegistrationNumber(vehicle, inspections);
        System.out.println("The cost is:" + cost);

        int pin = 1337;
        String number = "199013121337";
        String holder = "Crank Cain";
        YearMonth expiryDate = YearMonth.of(2020, 12);
        int CVC = 333;
        int payedAmount = 45;

        contr.payWithCard(pin, number, holder, expiryDate, CVC, payedAmount, cost);
        //boolean
        boolean specInspectionResult = true;
        for(int i = 0; i < 3; i++) {
            contr.whatInspectRequest(specInspectionResult, inspections);
            System.out.println();
            System.out.println("Inspection Checklist Turn " + (i+1));
            System.out.println("InspectionA OK: " + inspections.isInspectionA());
            System.out.println("InspectionB OK: " + inspections.isInspectionB());
            System.out.println("InspectionC OK: " + inspections.isInspectionC());

        }

    }
}
