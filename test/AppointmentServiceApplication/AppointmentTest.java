/*
Author: Jarred L. McCormick
Date 1 Feb 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of AppointmentTest.java is to test the appointment object and
give it the attributes that were derived from the requriemtns.
It creats the appointment object with a apptID, apptDate, and
apptDesc.
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
public class AppointmentTest {
    
    public AppointmentTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of add method of class Appointment
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Appointment appointment = null;
        Appointment instance = null;
        instance.add(appointment);
        //ToDO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test setapptDesc method of class Appointment.
     */
    @Test
    public void testSetapptDescription(){
        System.out.println("SetapptDescription");
        String apptDesc = "";
        Appointment instance = null;
        instance.setapptDesc(apptDesc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test getapptID method, of class Appointment
     */
    public void testgetapptID(){
        System.out.println("getapptID");
        Appointment intance = null;
        Object expResult = null;
        Object result  = instance.getapptID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
        /**
     * Test of apptID method, of class Appointment.
     */
    @Test
    public void testapptID() {
        System.out.println("apptID");
        Appointment instance = null;
        Object expResult = null;
        Object result = instance.apptID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
