package main.java.controller;

import main.java.integration.CardTerminal;
import main.java.integration.DatabaseManager;
import main.java.model.Inspection;
import main.java.model.InspectionChecklist;
import main.java.model.Payment;
import main.java.model.Vehicle;
import se.kth.iv1350.garage.Garage;

import java.time.YearMonth;
import java.util.Date;

/**
 * Created by ocean on 2017-04-27.
 */
public class Controller {
    private DatabaseManager DM;
    private Garage GRG;
    private Payment payment;

    public Controller(DatabaseManager DM, Garage GRG, Payment payment) {
        this.DM = DM;
        this.GRG = GRG;
        this.payment = payment;
    }
    public void newInspection(){
        GRG.nextCustomer();
    }

    public void closeGarage(){
        GRG.closeDoor();
    }

    public int enterRegistrationNumber( Vehicle vehicle, InspectionChecklist inspections ){
        Inspection currentInspection = new Inspection(vehicle, inspections);
        int cost = currentInspection.calculateCost();
        return cost;

    }

    public void payWithCard(int pin, String number, String holder, YearMonth expiryDate, int CVC, int payedAmount, int cost){
        payment.cardPayment(pin, number, holder, expiryDate, CVC, payedAmount, cost);
    }

    public void whatInspectRequest(boolean specInspectionResult, InspectionChecklist inspections){
        if(!inspections.isInspectionA()){
            inspections.setInspectionA(specInspectionResult);
            return;}
        if(!inspections.isInspectionB()){
            inspections.setInspectionB(specInspectionResult);
            return;}
        if(!inspections.isInspectionC()){
            inspections.setInspectionC(specInspectionResult);
            return;}
    }

}
