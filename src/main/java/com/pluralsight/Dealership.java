package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    // Fields
    private String address;
    private String phone;
    private String name;
    private ArrayList<Vehicle> inventory;

    // Constructor
    public Dealership(String address, String phone, String name) {

        this.address = address;
        this.phone = phone;
        this.name = name;
        inventory = new ArrayList<>();
    }
    

    // Getters
    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    public void removeVehicle(Vehicle vehicle) {

    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int minYear, int maxYear) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type) {
        return null;
    }
}