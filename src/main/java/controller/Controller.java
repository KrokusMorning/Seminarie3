package main.java.controller;

import main.java.integration.DatabaseManager;
import main.java.model.Inspection;
import main.java.model.InspectionChecklist;
import main.java.model.Payment;
import main.java.model.Vehicle;
import se.kth.iv1350.garage.Garage;
import se.kth.iv1350.payauth.CreditCard;

/**
 * The controller class handles all calls from the View.
 */
public class Controller {
    private DatabaseManager DM;
    private Garage GRG;
    private Payment payment;

    /**
     *Creates a new instance with the specified <code>DatabaseManager</code>, <code>Garage</code> and <code>Payment</code>.
     *
     * @param DM   The database manager used for all database calls.
     * @param GRG    Used for all calls to Garage.
     * @param payment      Used for calls to Payment.
     * */
    public Controller(DatabaseManager DM, Garage GRG, Payment payment) {
        this.DM = DM;
        this.GRG = GRG;
        this.payment = payment;
    }

    /**
     * Initiates an inspection. Opens garage door and updates quenumber on display.
     */
    public void newInspection(){
        GRG.nextCustomer();
    }

    /**
     * Closes garage door.
     */
    public void closeGarage(){
        GRG.closeDoor();
    }

    /**   Creates a new <code>Inspection</code> instance which is then used to calculate the cost
     * for the necessary inspections of the vehicle.
     * 
     * @param vehicle    Instance representing the vehicle being inspected .
     * @param inspections   Instance specifying what inspections to be done for the vehicle.
     * @return    The cost for the inspections to be don for the vehicle.
     */
    public InspectionChecklist costForInspection(Vehicle vehicle){
        InspectionChecklist inspections = DM.findInspectionsByVehicle(vehicle);
        Inspection currentInspection = new Inspection(vehicle, inspections);
        currentInspection.calculateCost(vehicle);
        return inspections;
    }

    /**
     * Authorizes card payment and prints receipt.
     *
     * @param creditCard Credit card used for payment.
     * @param payedAmount   The amount payed by card holder.
     * @param cost        Cost for the  purchase.
     */
    public void payWithCard(CreditCard creditCard, int payedAmount, int cost){
        payment.cardPayment(creditCard, payedAmount, cost);
    }

    /**
     * Updates inspection checklist whit inspection result
     *
     * @param specInspectionResult Tells if the inspection was pass or fail.
     * @param checklist Checklist telling what inspections are passed or failed.
     * @param vehicle   The vehicle being inspected.
     */
    public void whatInspectRequest(boolean specInspectionResult, InspectionChecklist checklist, Vehicle vehicle){
        DM.updateSpecResult(specInspectionResult, checklist, vehicle);
    }

    /**
     * Creates final inspection result and prints it.
     *
     * @param vehicle   The vehicle being inspected.
     * @param checklist Checklist telling what inspections are passed or failed.
     */
    public void inspectionsCompleted(Vehicle vehicle, InspectionChecklist checklist){
        DM.inspectionsCompleted(vehicle, checklist);
    }
}
