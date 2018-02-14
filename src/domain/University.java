/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Nacho
 */
public class University {
    private String name, location;
    private int legalID, employeeCount;
    
    //Blank constructor
    public University() {
    }
    
    //Constructor
    public University(String name, String location, int legalID, int employeeCount) {
        this.name = name;
        this.location = location;
        this.legalID = legalID;
        this.employeeCount = employeeCount;
    }

    //Getters and setters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLegalID() {
        return legalID;
    }

    public void setLegalID(int legalID) {
        this.legalID = legalID;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
    
    
}
