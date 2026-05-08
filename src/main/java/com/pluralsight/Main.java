package com.pluralsight;

import com.pluralsight.ui.UserInterface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //Program will be responsible for starting the application via its main() method and
        //then creating the user interface and getting it started.

        UserInterface ui = new UserInterface();

        ui.display();




    }
}
