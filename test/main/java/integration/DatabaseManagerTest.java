package main.java.integration;

import main.java.model.Inspection;
import main.java.model.InspectionChecklist;
import main.java.model.InspectionResults;
import main.java.model.Vehicle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ocean on 2017-05-01.
 */
class DatabaseManagerTest {
    Vehicle testVehicle;
    InspectionChecklist checklist;
    Inspection instance;
    DatabaseManager DM;
    Printer PRTR;

    @BeforeEach
    void setUp() {
        testVehicle = new Vehicle("HEJ123");
        checklist = new InspectionChecklist(testVehicle);
        PRTR = new Printer();
        DM = new DatabaseManager(PRTR);
    }

    @AfterEach
    void tearDown() {
        instance = null;
        testVehicle = null;
        checklist = null;
    }

    @Test
    void testCorrectVehicleupdateSpecResult() {
        boolean specResult = true;
        Vehicle anotherVehicle = new Vehicle("CBA321");
        DM.updateSpecResult(specResult, checklist, anotherVehicle);
        boolean result = checklist.isInspectionA();
        boolean expResult = false;
        assertEquals("Method does not validate car.", expResult, result);

    }
    @Test
    void testUpdateSpecResult() {
        boolean specResult = true;
        boolean expResult = true;
        for(int i = 0; i < 3; i++){
            DM.updateSpecResult(specResult, checklist, testVehicle);
        }
        boolean result = checklist.isInspectionA() && checklist.isInspectionB() && checklist.isInspectionC();

        DM.updateSpecResult(specResult, checklist, testVehicle);
        assertEquals("Method does not update result correctly.", expResult, result);
    }

    @Test
    void testFindInspectionbyVehicle() {
        String expResult = checklist.getVehicle().getRegNo();
        InspectionChecklist testChecklist = DM.findInspectionsByVehicle(testVehicle);
        String result = testChecklist.getVehicle().getRegNo();
        assertEquals("Method does not create a InspectionChecklist correctly", expResult, result);
    }


}