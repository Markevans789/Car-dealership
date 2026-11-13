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


}
