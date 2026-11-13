package com.pluralsight;

public class Vehicle {
    // field
    private String model;
    private String color;
    private String make;
    private int mileage;
    private int year;
    private String type;
    private int vin;
    private double price;

    //Constructer
    public Vehicle(String model, String color, String make, int mileage, int year, String type, int vin, double price){
        this.model = model;
        this.color = color;
        this.make = make;
        this.mileage = mileage;
        this.year = year;
        this.type = type;
        this.vin = vin;
        this.price = price;
    }

    //Getter
    public String model(){
        return model;
    }

    public String color(){
        return color;
    }

    public String make(){
        return make;
    }

    public int mileage(){
        return mileage;
    }

    public int year(){
        return year;
    }

    public String type(){
        return type;
    }

    public int vin(){
        return vin;
    }

    public double price(){
        return price;
    }

    //Setters
    public void setmodel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setmake(String make){
        this.make = make;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void setyear(int year){
        this.year = year;
    }

    public void settype(String type){
        this.type = type;
    }

    public void setvin(int vin){
        this.vin = vin;
    }

    public void setprice (double price){

    }
}
