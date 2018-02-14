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
public class Car {
    private String brand, color, reservationDate;
    private int speed, year;
    private double mileage;
    private boolean state;
    
    //Blanck constructor
    public Car() {
    }
    
    //Constructor
    public Car(String brand, String color, String reservationDate, int speed, int year, double mileage, boolean state) {
        this.brand = brand;
        this.color = color;
        this.reservationDate = reservationDate;
        this.speed = speed;
        this.year = year;
        this.mileage = mileage;
        this.state = state;
    }
    
    //Getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    

    
}
