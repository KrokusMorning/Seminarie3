package main.java.startup;

import main.java.controller.Controller;
import main.java.integration.DatabaseManager;
import main.java.view.View;

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
        DatabaseManager dbMgr = new DatabaseManager();
        Controller contr = new Controller(dbMgr);
        View view = new View(contr);
        view.sampleExecution();
    }
}