package com.pluralsight.models.models;

import java.util.ArrayList;


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
