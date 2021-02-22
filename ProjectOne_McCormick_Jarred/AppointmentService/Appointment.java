/*
Author: Jarred L. McCormick
Date 1 Feb 21
Course ID: Course ID: CS-320-T3229
Description:
The purpose of Appointment.java is to build the appointment object and
give it the attributes that were derived from the requriemtns.
It creats the appointment object with a apptID, apptDate, and
apptDesc.
 */
package AppointmentServiceApplication;
import java.util.*;


/**
 *
 * @author joker
 */
public class Appointment {
    
    //local variables for the Appointment Class
    private String apptID;
    private String apptDesc;
    private Date currentDate = new Date();
    private Date appointmentDate = new Date();
    
    
    
    public Appointment (String apptID, String apptDesc) {
        if(apptID == null || apptID.length()>10){
            throw new IllegalArgumentException("Invalid Appointment ID.");
        }
        if(apptDesc == null || apptDesc.length()>50){
            throw new IllegalArgumentException("Invalid Description.");
        }
        if(appointmentDate == null || appointmentDate.before(currentDate)){
            throw new IllegalArgumentException("Invalid Date");
        }
    }

    void setappointmentDate(String appointmentDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setapptDesc(String apptDesc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getapptID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(Appointment appointment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object apptID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

