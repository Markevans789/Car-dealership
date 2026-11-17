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
    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public String getMake(){
        return make;
    }

    public int getMileage(){
        return mileage;
    }

    public int getYear(){
        return year;
    }

    public String getType(){
        return type;
    }

    public int getVin(){
        return vin;
    }

    public double getPrice(){
        return price;
    }

    //Setters
    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setVin(int vin){
        this.vin = vin;
    }

    public void setPrice (double price) {
        this.price = price;
    }
}
