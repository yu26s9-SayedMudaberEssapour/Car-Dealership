package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    //will hold information about the dealership and maintain a list of
    //vehicles. It will also have the methods to search, add, and remove vehicles from
    //the list


    private String name;
    private String adress;
    private String phone;

    //this arraylist will keep track of vehicles
    ArrayList<Vehicle> inventory = new ArrayList<>();

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public Dealership(String name, String adress, String phone) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




    public List<Vehicle> getVehicleByPrice(double min, double max){
        return null;
    }


    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int year){
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        return null;
    }


    public List<Vehicle> getVehiclesByMakeModel(int mileage){
        return null;
    }

    public List<Vehicle> getVehiclesByMakeType(String make, String model){
        return null;
    }


    //add functionality
    public List<Vehicle> getAllVehicles(){

        return inventory;
    }


    //add functionality
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicles(){

    }



}
