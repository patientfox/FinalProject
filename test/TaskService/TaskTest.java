/*
Author: Jarred L. McCormick
Date 31 Jan 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of TaskTest.java is to verify that the requirements are
met for the task.java class.
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
public class TaskTest {
    
    public TaskTest() {
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
     * Test of add method, of class Task.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Task task = null;
        Task instance = null;
        instance.add(task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settaskName method, of class Task.
     */
    @Test
    public void testSettaskName() {
        System.out.println("settaskName");
        String taskName = "";
        Task instance = null;
        instance.settaskName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settaskDescription method, of class Task.
     */
    @Test
    public void testSettaskDescription() {
        System.out.println("settaskDescription");
        String taskDescription = "";
        Task instance = null;
        instance.settaskDescription(taskDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettaskID method, of class Task.
     */
    @Test
    public void testGettaskID() {
        System.out.println("gettaskID");
        Task instance = null;
        Object expResult = null;
        Object result = instance.gettaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taskID method, of class Task.
     */
    @Test
    public void testTaskID() {
        System.out.println("taskID");
        Task instance = null;
        Object expResult = null;
        Object result = instance.taskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
