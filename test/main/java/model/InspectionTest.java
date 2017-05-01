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
    void testSetters() {
        int expResult;
        int result;
        checklist.setInspectionA(true);
        checklist.setInspectionB(true);
        checklist.setInspectionC(true);
        if(!checklist.isInspectionA() || !checklist.isInspectionB() || !checklist.isInspectionC())
            result = 1;
        else
            result = 0;

        expResult = 0;
        assertEquals("One or more setters do not work. ", expResult, result);
    }
    @Test
    void testcalculateCost() {
        checklist.setInspectionA(true);
        checklist.setInspectionB(true);
        checklist.setInspectionC(false);
        int expResult = 20;
        int result = instance.calculateCost(testVehicle);
        assertEquals("Calculation of cost is faulty", expResult, result);
    }

}