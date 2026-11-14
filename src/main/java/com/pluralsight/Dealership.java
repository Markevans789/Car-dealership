package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    // Fields
    private String address;
    private String phone;
    private String name;
    private ArrayList<Vehicle> inventory;

    // Constructor
    public Dealership(String address, String phone, String name){

        this.address = address;
                this.phone = phone;
                        this.name = name;
    }

    // Create the inventory ArrayList
    inventory = new ArrayList<Vehicle>();

    // Getters
    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getName(){
        return name;
    }
}
