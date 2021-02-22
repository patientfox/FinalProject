/*
Author: Jarred L. McCormick
Date 1 Feb 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of AppointmentService.java is to build the appointment object and
give it the attributes that were derived from the requriemtns.
It creats the appointment service and ensure that the appointments can be added,
removed, or modify with a apptDate, and apptDesc.
 */
package AppointmentServiceApplication;
import java.util.ArrayList;

/**
 *
 * @author joker
 */
public class AppointmentService {
    private ArrayList<Appointment> appointments;
    
    public AppointmentService() {
        appointments = new ArrayList<>();
    }
    //Add Contact if it doesnt exist.
    public boolean add(Appointment appointment){
        boolean Exist = false;
        for (Appointment x: appointments){
            if (x.equals(appointment)){
                Exist = true;
            }
        }
        
        if (!Exist){
            appointments.add(appointment);
            System.out.println("New Contact has been added.");
            return true;
        }
        else {
            System.out.println("Contact already exist.");
            return false;
        }
    }
    //Removes Contact
    public boolean remove(String apptID){
        for (Appointment x : appointments)
        if (x.getapptID().equals(apptID)){
            appointments.remove(x);
            System.out.println("Your contact has succssfully been removed");
            return true;
        }
            System.out.println("Contact Doesn't Exist");
            return false;
    }
    //Updates Contact
    public boolean update(String apptID, String apptDesc, String appointmentDate){
        for (Appointment x : appointments) {
            if (x.getapptID().equals(apptID)){
                if (!apptDesc.equals(""))
                    x.setapptDesc(apptDesc);
                if (!appointmentDate.equals(""))
                    x.setappointmentDate(appointmentDate);
                System.out.println("Contact has been updated.");
                return true;
            }
        }
        System.out.println("Contact isn't present.");
        return false;
    }

    boolean update(String apptID, String apptDesc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
