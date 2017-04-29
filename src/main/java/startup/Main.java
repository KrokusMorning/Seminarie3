package main.java.startup;

import main.java.controller.Controller;
import main.java.integration.CardTerminal;
import main.java.integration.DatabaseManager;
import main.java.integration.Printer;
import main.java.model.Payment;
import main.java.view.View;
import se.kth.iv1350.garage.Garage;
import se.kth.iv1350.payauth.PaymentAuthorization;

/**
 * Starts the application.
 */
public class Main {
    /**
     * This is the application's main method, which starts the entire car inspection system.
     *
     * @param args The are no command line parameters.
     */
    public static void main(String[] args) {
        Garage GRG = new Garage();
        PaymentAuthorization PA = new PaymentAuthorization();
        Printer PRTR = new Printer();
        DatabaseManager DM = new DatabaseManager(PRTR);
        CardTerminal CT = new CardTerminal(PA);
        Payment payment = new Payment(PRTR, CT);
        Controller contr = new Controller(DM, GRG, payment);
        View view = new View(contr);
        view.sampleExecution();
    }
}