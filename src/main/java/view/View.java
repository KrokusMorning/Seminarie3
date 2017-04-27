package main.java.view;

import main.java.controller.Controller;

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
        String regNo = "ABC123";
        int cost = contr.enterRegistrationNumber(regNo);
        System.out.println("The cost is:" + cost);
    }
}
