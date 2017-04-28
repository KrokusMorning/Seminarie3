package main.java.controller;

import main.java.integration.CardTerminal;
import main.java.integration.DatabaseManager;
import main.java.model.Inspection;
import main.java.model.InspectionChecklist;
import main.java.model.Vehicle;
import se.kth.iv1350.garage.Garage;

import java.util.Date;

/**
 * Created by ocean on 2017-04-27.
 */
public class Controller {
    private DatabaseManager DM;
    private Garage GRG;
    private CardTerminal CT;

    public Controller(DatabaseManager DM, Garage GRG, CardTerminal CT) {
        this.DM = DM;
        this.GRG = GRG;
        this.CT = CT;
    }
    public void newInspection(){
        GRG.nextCustomer();
    }

    public void closeGarage(){
        GRG.closeDoor();
    }

    public int enterRegistrationNumber( String regNo ){
        Vehicle vehicle = new Vehicle(regNo);
        InspectionChecklist inspections = DM.findInspectionsByVehicle(vehicle);
        Inspection currentInspection = new Inspection(vehicle, inspections);
        int cost = currentInspection.calculateCost();
        return cost;

    }

    public void payWithCard(int pin, String number, String Holder, Date expiryDate, int CVC, int payedAmount, int cost){

    }
}
