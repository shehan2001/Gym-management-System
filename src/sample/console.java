package sample;

import java.io.IOException;
import java.util.Scanner;

public class console {

  private  static   MyGymManager Console = new MyGymManager();


    public static void console()  {
        String choice = "";
        


        Scanner sc = new Scanner(System.in);
// giving user options to do what he/she desires

        System.out.println("choose: \n" +
                "1: to go to add members\n" +
                "2: to go to delete members\n" +
                "3: to go to print lists of members\n" +
                "4: to sort in ascending\n" +
                "5: to save members data");

        choice = sc.next();


        if (choice.equals("1")) {


//object created.method name. this process is used to open other relevant options below

            Console.Add_New_Member();

        }
        else if (choice.equals("2")) {

            String member_number="";

            Console.Delete_Old_Member(member_number);
        }else if (choice.equals("3")){

            Console.list_of_members();

        }else if (choice.equals("4")){

            Console.Sort_ascending();

        }else if (choice.equals("5")){

            Console.save_member();
        }else{
            System.out.println("INCORRECT INPUT");
        }

    }
}
