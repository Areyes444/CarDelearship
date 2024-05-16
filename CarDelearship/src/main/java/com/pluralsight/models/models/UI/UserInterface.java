package com.pluralsight.models.models.UI;

import com.pluralsight.models.models.Dealership;
import com.pluralsight.models.models.Vehicle;
import com.pluralsight.models.models.services.DealershipFileManager;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface
{
    static final Scanner userInput = new Scanner(System.in);
    public Dealership dealership;
    public DealershipFileManager fileManager;
    public ArrayList<Vehicle> vehiclelist;
    public Vehicle vehicle;

    public int display()
    {
        init();

        while (true) {
            try {
                System.out.println();
                System.out.println("Welcome to the Dealership ");
                System.out.println("-".repeat(100));
                System.out.println("1) Find vehicle within a Price range ");
                System.out.println("2) Find a vehicle by Make/Model ");
                System.out.println("3) Find a vehicle by Year range ");
                System.out.println("4) Find a vehicle by Color ");
                System.out.println("5) Find vehicle by Mileage range ");
                System.out.println("6) Find a Vehicle by type(car,truck,SUV,van) ");
                System.out.println("7) List All vehicles ");
                System.out.println("8) Add a Vehicle ");
                System.out.println("9) Remove a vehicle ");
                System.out.println("99) Exit/Quit");
                System.out.println("-".repeat(100));
                System.out.println("Please enter your choice: ");
                int choice = userInput.nextInt();

                switch (choice) {
                    case 1:
                        //processGetByPriceRequest();
                        break;
                    case 2:
                        //processGetByMakeModelRequest
                        break;
                    case 3:
                        //processGetByYearRequest
                        break;
                    case 4:
                        //processGetByColorRequest
                        break;
                    case 5:
                        //processGetByMileageRequest
                        break;
                    case 6:
                        //processGetByVehiclesTypeRequest
                        break;
                    case 7:
                        processGetAllVehiclesRequest();
                        break;
                    case 8:
                        //processAddVehicleRequest
                        break;
                    case 9:
                        //processRemoveVehicleRequest
                        break;
                    case 99:
                        System.out.println();
                        System.out.println("Have A Great rest of your day, GoodBye! ");
                        return 0;

                    default:
                        System.out.println("Invalid option.");


                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


    }


   private void init()
   {
       fileManager = new DealershipFileManager();
       this.dealership = fileManager.getDealership();

   }
   
   private void displayVehicles(ArrayList<Vehicle> vehicles)
   {
       if (vehicles.isEmpty())
       {
           System.out.println("Sorry, no vehicles found.");
       }else{
           System.out.println("Here is a list of all the vehicles: ");
           System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s ", "Vin", "Year", "Make", "Model", "VehicleType", "Color", "Odometer", "Price"));
           System.out.println("-".repeat(100));
           for(Vehicle vehicle: vehicles)
           {
               System.out.println(vehicle);
           }
       }
   }
   
   public void processGetAllVehiclesRequest()
   {
       vehiclelist = dealership.getAllVehicles();
       displayVehicles(vehiclelist);
   }
}
