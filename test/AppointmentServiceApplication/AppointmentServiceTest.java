/*
Author: Jarred L. McCormick
Date 1 Feb 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of AppointmentServiceTest.java is to test build the appointment 
service object and give it the attributes that were derived from the requriemtns.
It creats the appointment service and ensure that the appointments can be added,
removed, or modify with a apptDate, and apptDesc.
 */
package AppointmentServiceApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joker
 */
public class AppointmentServiceTest {
    
    public AppointmentServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    /**
     * Test of add method, of class AppointmentService
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Appointment appointments = null;
        AppointmentService instance = new AppointmentService();
        boolean expResult = false;
        boolean result = instance.add(appointments);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     /**
     * Test of remove method, of class AppointmentService
     */
    @Test
    public void testRemove() {
        System.out.println("Remove");
        String apptID = "";
        AppointmentService instance = new AppointmentService();
        boolean expResult = false;
        boolean result = instance.remove(apptID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     /**
     * Test of update method, of class TestService
     */
    @Test
    public void testUpdate(){
        System.out.println("Update");
        String apptID = "";
        String apptDesc = "";
        AppointmentService instance = new AppointmentService();
        boolean expResult = false;
        boolean result = instance.update(apptID, apptDesc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }   
    
}
