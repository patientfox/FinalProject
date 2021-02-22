/*
Author: Jarred L. McCormick
Date 31 Jan 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of TaskServiceTest.java is to verify that the requirements are
met for the TaskService.java class.
 */
package TaskService;

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
public class TaskServiceTest {
    
    public TaskServiceTest() {
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
     * Test of add method, of class TestService
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Task tasks = null;
        TaskService instance = new TaskService();
        boolean expResult = false;
        boolean result = instance.add(tasks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     /**
     * Test of remove method, of class TestService
     */
    @Test
    public void testRemove() {
        System.out.println("Remove");
        String taskID = "";
        TaskService instance = new TaskService();
        boolean expResult = false;
        boolean result = instance.remove(taskID);
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
        String taskID = "";
        String taskName = "";
        String taskDescription = "";
        TaskService instance = new TaskService();
        boolean expResult = false;
        boolean result = instance.update(taskID, taskName, taskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
