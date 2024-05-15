package com.pluralsight.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DealershipFileManager
{

    private Dealership loadDealership()
    {
        Dealership dealership = null;

        try(Scanner fileScanner = new Scanner(new File("inventory.csv")))
        {
            String dealerline = fileScanner.nextLine();
            String[] parts = dealerline.split("\\|");
            dealership = new Dealership(parts[0],parts[1],parts[2]);

            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                String[] tokens = line.split("\\|");

                int vin = Integer.parseInt(tokens[0]);
                int year = Integer.parseInt(tokens[1]);
                String make = tokens[2];
                String model = tokens[3];
                String vehicleType = tokens[4];
                String color = tokens[5];
                int odometer = Integer.parseInt(tokens[6]);
                double price = Double.parseDouble(tokens[7]);

                Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                dealership.addVehicle(vehicle);

            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return dealership;

    }
    private void saveDealership(Dealership dealership)
    {
        return;
    }
}
