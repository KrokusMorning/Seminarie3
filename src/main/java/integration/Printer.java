package main.java.integration;

import main.java.model.CardReceipt;
import main.java.model.InspectionResults;

/**
 * Class representing a printer. Prints out various things on the screen.
 */
public class Printer {

    /**
     * Prints out details from card payment.
     *
     * @param receipt contains info about purchase.
     */
    public void printCardReceipt(CardReceipt receipt){
        System.out.println("Receipt \nHolder: "+ receipt.getCreditCard().getCardHolder() + "\nCard Number: " + receipt.getCreditCard().getNumber());
        System.out.println("Cost: " + receipt.getCost()+"$" +  "\n" + "Payed Amount: "+ receipt.getPayedAmount() + "$");
    }

    /**
     * Prints out inspection results.
     *
     * @param insRes The inspection results from a vehicle inspection.
     */
    public void printInspectionResults(InspectionResults insRes){
        System.out.println("\n" + "Inspection Results");
        System.out.println("Reg Number: " + insRes.getVehicle().getRegNo());
        System.out.println("Inspection A: " + insRes.getInspectionA());
        System.out.println("Inspection B: " + insRes.getInspectionB());
        System.out.println("Inspection C: " + insRes.getInspectionC());
        System.out.println("Final Result: " + insRes.getFinalResult());

    }
}
