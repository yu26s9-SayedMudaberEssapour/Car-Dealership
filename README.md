Car Dealership Management Application
Overview

This project is a console-based dealership management application built in Java. The application allows dealership staff to manage vehicle inventory through a menu-driven interface. Users can search for vehicles using different filters, add new vehicles, remove vehicles, and view the entire inventory.

The project follows object-oriented programming principles and separates responsibilities into multiple classes for better organization and maintainability.

Features

Users can:

Find vehicles within a price range
Find vehicles by make and model
Find vehicles by year range
Find vehicles by color
Find vehicles by mileage range
Find vehicles by vehicle type
View all vehicles in inventory
Add a vehicle
Remove a vehicle
Save inventory changes to a CSV file
Technologies Used
Java
Object-Oriented Programming (OOP)
File Handling
ArrayLists
Maven Project Structure
Git & GitHub
Project Structure
Classes
Vehicle

Represents an individual vehicle in the dealership inventory.

Contains:

VIN
Year
Make
Model
Vehicle Type
Color
Mileage
Price
Dealership

Stores dealership information and maintains the inventory list.

Responsibilities:

Store dealership name, address, and phone number
Add vehicles
Remove vehicles
Search vehicles using multiple filters
Return all vehicles
DealershipFileManager

Handles reading from and writing to the inventory file.

Responsibilities:

Load dealership data from the CSV file
Parse vehicle information
Save updated dealership inventory back to the file
UserInterface

Handles all user interaction.

Responsibilities:

Display menu options
Read user input
Call dealership methods
Display vehicle search results
Program

Contains the main() method and starts the application.

Inventory File Format

The application uses a pipe-delimited (|) CSV file to store dealership and vehicle information.

Example:

D & B Used Cars|111 Old Benbrook Rd|817-555-5555
10112|1993|Ford|Explorer|SUV|Red|525123|995.00
37846|2001|Ford|Ranger|Truck|Yellow|172544|1995.00
44901|2012|Honda|Civic|SUV|Gray|103221|6995.00
Application Menu
1 - Find vehicles within a price range
2 - Find vehicles by make / model
3 - Find vehicles by year range
4 - Find vehicles by color
5 - Find vehicles by mileage range
6 - Find vehicles by type
7 - List ALL vehicles
8 - Add a vehicle
9 - Remove a vehicle
99 - Quit
What I Learned

Through this project, I practiced:

Object-oriented design
File input/output operations
Working with collections (ArrayList)
Creating a layered application architecture
Parsing and saving CSV data
Building a console-based user interface
Implementing search functionality
Using Git and GitHub for version control
Future Improvements

Possible future features include:

Support for multiple dealerships
Improved error handling and validation
Sorting functionality
Graphical user interface (GUI)
Database integration
Vehicle update/edit functionality
How to Run the Application
Clone the repository:
git clone https://github.com/yu26s9-SayedMudaberEssapour/Car-Dealership
Open the project in IntelliJ or another Java IDE
Run the Program.java file
GitHub Repository

Add your GitHub repository link here:

[https://github.com/yourusername/your-repo-name](https://github.com/yu26s9-SayedMudaberEssapour/Car-Dealership)

Author
Sayed Essapour
Student at Year Up United
