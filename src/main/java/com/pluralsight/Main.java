package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //Program will be responsible for starting the application via its main() method and
        //then creating the user interface and getting it started.


        DealershipFileManager dlf = new DealershipFileManager();

        Dealership d = dlf.getDealership();

        dlf.saveDealership(d);
        System.out.println(d.getName());
        //dlf.saveDealership();
        //dlf.saveDealership();


    }
}
