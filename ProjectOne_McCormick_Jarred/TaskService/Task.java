/*
Author: Jarred L. McCormick
Date 24 Jan 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of Task.java is to build the task object and
give it the attributes that were derived from the requriemtns.
It creats the task object with a taskID, taskName, and taskDescription.
 */
package TaskService;

/**
 *
 * @author joker
 */
public class Task {
    private String taskID;
    private String taskName;
    private String taskDescription;
    
    
    //Getting the custructor ready
public Task(String taskID, String taskName, String taskDescription){
    if(taskID == null || taskID.length()>10){
        throw new IllegalArgumentException("Invalid Task ID");
    }
    if(taskName == null || taskName.length()>10){
        throw new IllegalArgumentException("Invalid Task Name.");
    }
    if(taskDescription == null || taskDescription.length()>50){
        throw new IllegalArgumentException("Invalid Description given.");
    }
    
    this.taskID = taskID;
    this.taskName = taskName;
    this.taskDescription = taskDescription;
}

public String getTaskID(){
    return taskID;
}

public String getTaskName(){
    return taskName;
}

public String getTaskDescription(){
    return taskDescription;
}

    void add(Task task) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void settaskName(String taskName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void settaskDescription(String taskDescription) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object gettaskID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object taskID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
