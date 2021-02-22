/*
Author: Jarred L. McCormick
Date 31 Jan 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of TaskService.java is to manage the task object
that is created by the task class.  It gives the user the ability
to add, delete, or modify task that are stored within the array.
 */
package TaskService;
import java.util.ArrayList;
        
/**
 *
 * @author joker
 */
public class TaskService {
    private ArrayList<Task> tasks;
    
    public TaskService(){
        tasks = new ArrayList<>();
    }
    //Add Task if it doesnt exist.
    public boolean add(Task task){
        boolean Exist = false;
        for (Task x : tasks){
            if (x.equals(task)){
                Exist = true;
            }
        }
        
        if (!Exist){
            task.add(task);
            System.out.println("New task has been added.");
            return true;
        }
        else {
            System.out.println("Task already exist.");
            return false;
        }
    }
    //Removes Task
    public boolean remove(String taskID){
        for (Task x : tasks)
        if (x.taskID().equals(taskID)){
            tasks.remove(x);
            System.out.println("Your task has succssfully been removed");
            return true;
        }
            System.out.println("Task Doesn't Exist");
            return false;
    }
    //Updates Task
    public boolean update(String taskName, String taskDescritpion, Object taskID){
        for (Task x : tasks) {
            if (x.taskID().equals(taskID)){
                if (!taskName.equals(""))
                    x.settaskName(taskName);
                if (!taskDescritpion.equals(""))
                    x.settaskDescription(taskDescritpion);
                System.out.println("Task has been updated.");
                return true;
            }
        }
        System.out.println("Task isn't present.");
        return false;
    }
}

