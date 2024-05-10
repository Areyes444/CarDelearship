package com.pluralsight.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Dealership
{
    private ArrayList<Vehicle> vehicles;
    private String name;
    private String address;
    private String phone;

    public Dealership(String name,String address, String phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
        loadVehicleInformation();
    }


    private void loadVehicleInformation()
    {

        File file = new File("files/inventory.csv");
        try(Scanner fileScanner = new Scanner(file))
        {
            fileScanner.nextLine();

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
                vehicles.add(vehicle);

            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

    }

    public void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles()
    {
        return vehicles;
    }

    public void removeVehicle(Vehicle vehicle)
    {
        //Will add in a bit
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double price)
    {
        //min-Max
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model)
    {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int year)
    {
        //min-max
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color)
    {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int odometer)
    {
        //min-max
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType)
    {
        return null;
    }





}
