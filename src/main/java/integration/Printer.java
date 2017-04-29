package main.java.integration;

import main.java.model.CardReceipt;
import main.java.model.InspectionResults;

/**
 * Created by ocean on 2017-04-28.
 */
public class Printer {
    public void printCardReceipt(CardReceipt receipt){
        System.out.println("Receipt" + "\n" + "Cost: " + receipt.getCost()+"$" +  "\n" + "Payed Amount: "+ receipt.getPayedAmount() + "$");
    }

    public void printInspectionResults(InspectionResults insRes){
        System.out.println("\n" + "Inspection Results");
        System.out.println("Reg Number: " + insRes.getVehicle().getRegNo());
        System.out.println("InspectionA: " + insRes.getInspectionA());
        System.out.println("InspectionB: " + insRes.getInspectionB());
        System.out.println("InspectionC: " + insRes.getInspectionC());

    }
}
