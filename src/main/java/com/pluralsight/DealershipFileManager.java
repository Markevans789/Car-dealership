package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {


    public Dealership getDealership() {

        Dealership dealership = null;

        Vehicle vehicle;
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader("inventory.csv"));

            // Read dealership information
            String line = reader.readLine();

            String[] dealershipInfo = line.split("\\|");

            String address = dealershipInfo[0];

            String phone = dealershipInfo[1];

            String name = dealershipInfo[2];

            dealership = new Dealership(address, phone, name);

            //Read vehicles
            while ((line = reader.readLine()) != null) {

                String[] vehicleData = line.split("\\|");

                int vin = Integer.parseInt(vehicleData[0]);
                String make = vehicleData[1];
                String model = vehicleData[2];
                String color = vehicleData[3];
                String type = vehicleData[4];
                int year = Integer.parseInt(vehicleData[5]);
                int mileage = Integer.parseInt(vehicleData[6]);
                double price = Double.parseDouble(vehicleData[7]);

                vehicle = new Vehicle(
                        model,
                        color,
                        make,
                        mileage,
                        year,
                        type,
                        vin,
                        price
                );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }
    
}