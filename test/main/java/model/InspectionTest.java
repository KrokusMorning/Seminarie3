package main.java.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ocean on 2017-05-01.
 */
class InspectionTest {
    Vehicle testVehicle;
    InspectionChecklist checklist;
    Inspection instance;

    @BeforeEach
    void setUp() {
        testVehicle = new Vehicle("HEJ123");
        checklist = new InspectionChecklist(testVehicle);
        instance = new Inspection(testVehicle, checklist);
    }

    @AfterEach
    void tearDown() {
        instance = null;
        testVehicle = null;
        checklist = null;
    }

    @Test
    void testCalculateCost() {
        checklist.setInspectionA(true);
        checklist.setInspectionB(true);
        checklist.setInspectionC(false);
        int expResult = 20;
        instance.calculateCost(testVehicle);
        int result = checklist.getCost();
        assertEquals("Calculation of cost is faulty", expResult, result);
    }

    @Test
    void testCalculateCostWrongVehicle() {
        Vehicle wrongVehicle = new Vehicle("CBA321");
        checklist.setInspectionA(true);
        checklist.setInspectionB(true);
        checklist.setInspectionC(false);
        int expResult = 0;
        instance.calculateCost(wrongVehicle);
        int result = checklist.getCost();
        assertEquals("Vehicle verification is faulty", expResult, result);
    }



}