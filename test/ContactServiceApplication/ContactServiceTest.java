/*
Author: Jarred L. McCormick
Date 24 Jan 21
Course ID: CS-320-T3229
Description:
The purpose of ContactServiceTest.java is to verify that the requirements are
met for the contactservice.java class.
 */
package ContactServiceApplication;

import ContactServiceApplication.ContactService;
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
public class ContactServiceTest {
    
    public ContactServiceTest() {
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
     * Test of add method, of class ContactService.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Contact contact = null;
        ContactService instance = new ContactService();
        boolean expResult = false;
        boolean result = instance.add(contact);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ContactService.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        String ContactID = "";
        ContactService instance = new ContactService();
        boolean expResult = false;
        boolean result = instance.remove(ContactID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ContactService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String FirstName = "";
        String LastName = "";
        String ContactID = "";
        String ContactAddress = "";
        String ContactPhone = "";
        ContactService instance = new ContactService();
        boolean expResult = false;
        boolean result = instance.update(FirstName, LastName, ContactID, ContactAddress, ContactPhone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    //@Test

    }
    
