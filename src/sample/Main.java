package sample;

import javafx.application.Application;

import java.util.Scanner;


// mian class
public  class Main  {



    //..................main controller area..........



    public static void main(String[] args)  {

        String ui = "";



        Scanner sc = new Scanner(System.in);
//giving user option if he/ she wants to go to CLi or GUI

        System.out.println("choose: \n" +
                "1: to go to console mode\n" +
                "2: to go to GUI ");
        ui=sc.next();
        switch (ui){
            case "1":
                //class.method(since static is still available at that location) to open relevant class
                console.console();
                break;
            case "2":
                // to open second main project
                Application.launch(Gui.class,args);
                break;
        }

    }


}






