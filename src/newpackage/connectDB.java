/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Jericho Vega
 */
public class connectDB {
    
    public Connection conObj = null;
    public Statement stateObj = null;
    public ResultSet rsObj = null;
  
    public void connect() {// Creates Connection to the Database
        try{        
        String user = "root";
        String pass = "password";
        conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/facultydata?useTimezone=true&serverTimezone=UTC", user, pass);
        stateObj = conObj.createStatement(); // Creates a Statement
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void addCourseData(String name, String fullCourse, String abbr, int year, int section ){ // Add Data to Course Table    
          try{          
            PreparedStatement prepState = conObj.prepareStatement("INSERT INTO facultydata.course VALUES (?,?,?,?,?)");
            prepState.setString(1,name);
            prepState.setString(2,fullCourse);
            prepState.setString(3, abbr);
            prepState.setInt(4,year);
            prepState.setInt(5,section);
            prepState.execute();
        
        }
        catch(SQLException a){
            a.printStackTrace();
        }
           JOptionPane.showMessageDialog(null,"Course Added Successfully!");
        
    }
     
    public void addSubjectData(String sField, String sCode, String sDescription, int sLec, int sLab){
       try {
            PreparedStatement prepState = conObj.prepareStatement("INSERT INTO facultydata.subject VALUES (?,?,?,?,?)");
            prepState.setString(1,sField);
            prepState.setString(2,sCode);
            prepState.setString(3, sDescription);
            prepState.setInt(4, sLec);   
            prepState.setInt(5, sLab);
            
            prepState.execute();
       }
       catch(SQLException e) {
           e.printStackTrace();
       }
       JOptionPane.showMessageDialog(null,"Subject Added Successfully!");
    }
     
    public void addProfData(String ID, String lastName, String firstName, String status, String field, int hours, int avl, String fullName){
       try {
            PreparedStatement prepState = conObj.prepareStatement("INSERT INTO facultydata.professor VALUES (?,?,?,?,?,?,?,?)");
            prepState.setString(1,ID);
            prepState.setString(2,lastName);
            prepState.setString(3, firstName);
            prepState.setString(4, status);
            prepState.setString(5,field);
            prepState.setInt(6, hours);
            prepState.setInt(7,avl);
            prepState.setString(8,fullName);
            prepState.execute();
       }
       catch(SQLException e) {
           e.printStackTrace();
       }
       JOptionPane.showMessageDialog(null,"Professor Added Successfully!");
    }
    
    public void addCourseSecSchedData(String courseSecCode, String description, 
                                      String lecRoom, String labRoom, String day, 
                                      String timeIn, String timeOut, String prof)
    {
        try {
            PreparedStatement prepState = conObj.prepareStatement("INSERT INTO facultydata.COURSESCHED VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                prepState.setString(1, courseSecCode);
                prepState.setString(2, description);
                prepState.setString(3, lecRoom);
                prepState.setString(4, labRoom);
                prepState.setString(5, day);
                prepState.setString(6, timeIn);
                prepState.setString(7, timeOut);
                prepState.setString(8, prof);
                    prepState.execute();
        }catch(SQLException e) {
            e.printStackTrace();
        }
            JOptionPane.showMessageDialog(null,"Schedule Added Successfully!");  
        
        
        
    }
    
    
   /* public void addSchedData(String day, String section, String subject, int units, String time, int room){
      
        try {
            PreparedStatement prepState = conObj.prepareStatement("INSERT INTO facultydata.output VALUES (?,?,?,?,?,?)");
            prepState.setString(1, day);
            prepState.setString(2,section);
            prepState.setString(3,subject);
            prepState.setInt(4, units);
            prepState.setString(5, time);
            prepState.setInt(6,room);
        }catch(SQLException e) {
            e.printStackTrace();
        }
            JOptionPane.showMessageDialog(null,"Schedule Added Successfully!");
    }*/
    
}
