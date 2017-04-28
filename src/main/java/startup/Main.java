package main.java.startup;

import main.java.controller.Controller;
import main.java.integration.CardTerminal;
import main.java.integration.DatabaseManager;
import main.java.view.View;
import se.kth.iv1350.garage.Garage;

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
        DatabaseManager DM = new DatabaseManager();
        CardTerminal CT = new CardTerminal();
        Controller contr = new Controller(DM, GRG, CT);
        View view = new View(contr);
        view.sampleExecution();
    }
}