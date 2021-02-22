/*
Author: Jarred L. McCormick
Date 24 Jan 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of ContactTest.java is to verify that the requirements are
met for the contact.java class.
 */
package ContactServiceApplication;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContactTest {
    
    public ContactTest() {
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
     * Test of getFirstName method, of class Contact.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Contact instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Contact.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Contact instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactAddress method, of class Contact.
     */
    @Test
    public void testGetContactAddress() {
        System.out.println("getContactAddress");
        Contact instance = null;
        String expResult = "";
        String result = instance.getContactAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactPhone method, of class Contact.
     */
    @Test
    public void testGetContactPhone() {
        System.out.println("getContactPhone");
        Contact instance = null;
        String expResult = "";
        String result = instance.getContactPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactID method, of class Contact.
     */
    @Test
    public void testGetContactID() {
        System.out.println("getContactID");
        Contact instance = null;
        String expResult = "";
        String result = instance.getContactID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Contact.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String FirstName = "";
        Contact instance = null;
        instance.setFirstName(FirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Contact.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String LastName = "";
        Contact instance = null;
        instance.setLastName(LastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactAddress method, of class Contact.
     */
    @Test
    public void testSetContactAddress() {
        System.out.println("setContactAddress");
        String ContactAddress = "";
        Contact instance = null;
        instance.setContactAddress(ContactAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactPhone method, of class Contact.
     */
    @Test
    public void testSetContactPhone() {
        System.out.println("setContactPhone");
        String ContactPhone = "";
        Contact instance = null;
        instance.setContactPhone(ContactPhone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//Test that the contact is created correctly and that only
//valid parameters are accepted
public class ContactTest {
@Test
 void testContactClass(){
     Contact ContactClass = new Contact("FirstName", "LastName", "1234567891"
     ,"2234 Middle Creek", "1234" );
     assertTrue(ContactClass.getFirstName().equals("FirstName"));
     assertTrue(ContactClass.getLastName().equals("LastName"));
     assertTrue(ContactClass.getContactAddress().equals("2234 Middle Creek"));
     assertTrue(ContactClass.getContactPhone().equals("1234567891"));
     assertTrue(ContactClass.getContactID().equals("1234"));
 }
 @Test
 //Test to see if the contacts first name is to long.
 void testContactClassFirstNameToLong(){
   Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
       @Override
       public void execute() throws Throwable {
           new ContactClass("12345678910", "LastName","1234567891"
                   ,"2234 Middle Creek", "1234" );
       }
   });   
 }
  @Test
 //Test to see if the contacts last name is to long.
 void testContactClassLastNameToLong(){
   Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
       @Override
       public void execute() throws Throwable {
           new ContactClass("FirstName", "12345678910","1234567891"
                   ,"2234 Middle Creek", "1234" );
       }
   });   
 }
  @Test
 //Test to see if the contacts last name is to long.
 void testContactClassAddressToLong(){
   Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
       @Override
       public void execute() throws Throwable {
           new ContactClass("FirstName", "LastName","1234567891"
                   ,"2234 Middle Creek 123456789 1234567879", "1234" );
       }
   });   
 }
   @Test
 //Test to see if the contacts Phone is to long.
 void testContactClassPhoneToLong(){
   Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
       @Override
       public void execute() throws Throwable {
           new ContactClass("FirstName", "LastName","1234567891"
                   ,"2234 Middle Creek 123456789 1234567879", "1234" );
       }
   });   
 }
}
}
