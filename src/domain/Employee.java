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
public class Employee {
    private String name, lastName;
    private int ID;
    private float salary;
    private double laboredHours;
    
    //Blank constructor
    public Employee() {
    }
    
    //Constructor
    public Employee(String name, String lastName, int ID, float salary, double laboredHours) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.salary = salary;
        this.laboredHours = laboredHours;
    }
    
    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public double getLaboredHours() {
        return laboredHours;
    }

    public void setLaboredHours(double laboredHours) {
        this.laboredHours = laboredHours;
    }
    
}
