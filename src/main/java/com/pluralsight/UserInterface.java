package com.pluralsight;

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

        //a loop that will display the menu


        //here I am reading the user's command



        //creating a switch statement that calls each of the methods that matches
        //users command
    }

    private void displayVehicle(Vehicle vehicle){

        //I should be displaying vehicles here

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


        //displayVehicle method and pass in the getAll vehicle list
    }














}
