package main.java.model;
/**
 * A vehicle that is inspected.
 */
public class Vehicle {
    private final String regNo;

    /**
     *
     * @return registration number of vehicle.
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Creates a vehicle with the specified registration number.
     *
     * @param regNo The registration number of the newly created vehicle.
     */
    public Vehicle(String regNo) {
        this.regNo = regNo;
    }
}
