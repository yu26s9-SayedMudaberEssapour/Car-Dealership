package com.pluralsight.ui;

import com.pluralsight.Dealership;
import com.pluralsight.DealershipFileManager;
import com.pluralsight.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {

    //UserInterface will be responsible for all output to the screen, reading of user
    //input, and "using the Dealership's search, add, and remove as needed. (ex: when
    //the user selects "List all Vehicles", UserInterface would call the Dealership
    //method and then display the vehicles it returns.)


    //Dealership PriorityToyota = new Dealership()

    //this class will instantiate dealership


    private Dealership dealership;

    public UserInterface(){}



    private void init(){
        DealershipFileManager dlf = new DealershipFileManager();
        this.dealership = dlf.getDealership();
    }

    public void display(){

        init();
        String userInput;

        //a loop that will display the menu

        do {
            System.out.println("Welcome to Sayed's Dealership!! " +
                    "Please type one of the corresponding numbers for your option" +
                    "1 - Find vehicles within a price range " +
                    "2 - Find vehicles by make / model " +
                    "3 - Find vehicles by year range " +
                    "4 - Find vehicles by color " +
                    "5 - Find vehicles by mileage range " +
                    "6 - Find vehicles by type (car, truck, SUV, van) " +
                    "7 - List ALL vehicles " +
                    "8 - Add a vehicle " +
                    "9 - Remove a vehicle " +
                    "99 - Quit \n"
            );

            userInput = Console.promptForString("Your Response: ");

            switch(userInput){

                case "1" :
                    Console.promptForDouble("Enter you lowest price range: ");
                    Console.promptForDouble("Enter you highest price range: ");
                    //this method should take a range and return by the range
                    processGetByPriceRequest();
                    break;

                case "2" :
                    Console.promptForString("Enter the Make of the Car: ");
                    Console.promptForString("Enter the Model of the Car: ");
                    processGetByMakeModelRequest();
                    break;

                case "3" :
                    Console.promptForInt("Enter you lowest Year range: ");
                    Console.promptForInt("Enter you highest Year range: ");
                    processGetByYearRequest();
                    break;
                case "4" :
                    Console.promptForString("Enter the Color of the Vehicle: ");
                    processGetByColorRequest();
                    break;

                case "5" :
                    Console.promptForInt("Enter you lowest Mileage range: ");
                    Console.promptForInt("Enter you highest Mileage range: ");
                    processGetByMileageRequest();
                    break;

                case "6" :
                    Console.promptForString("Enter the type (car, truck, SUV, van): ");
                    processGetByVehicleTypeRequest();
                    break;

                case "7" :
                    processGetByAllVehiclesRequest();
                    break;

                case "8" :
                    processAddVehicleRequest();
                    break;

                case "9" :
                    processRemoveVehicleRequest();
                    break;

                case "99" :
                    System.out.println("You have exited the application: "
                            + "Good Bye!!!");
                    break;
                default:
                    break;

            }

        }
        while(!userInput.equalsIgnoreCase("99"));


        //here I am reading the user's command

        //creating a switch statement that calls each of the methods that matches
        //users command
    }


    //this is a helper method
    private void displayVehicle(List vehicle){

        //I should be displaying vehicles here


        for(Object v: vehicle){
            System.out.println(v);
        }

    }



    public void processGetByPriceRequest(){

    }

    public void processGetByMakeModelRequest(){}


    public void processGetByYearRequest(){}

    public void processGetByColorRequest(){}


    public void processGetByMileageRequest(){}


    public void processGetByVehicleTypeRequest(){}


    public void processGetByAllVehiclesRequest(){}

    public void processAddVehicleRequest(){}

    public void processRemoveVehicleRequest(){}




    public void processAllVehiclesRequest(){

        //list all vehicles in the dealership

        //call dealerships getAllVehicles()

        
        displayVehicle(dealership.getAllVehicles());


        //displayVehicle method and pass in the getAll vehicle list
    }














}
