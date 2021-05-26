package sample;


import java.io.*;
import java.util.*;


public class  MyGymManager  implements Gym_Manager {

//making an arraylist of class Default type
    public static ArrayList<Default_members> member_list = new ArrayList<>(100);
    public int count = 0;
    public Scanner sc = new Scanner(System.in);




// add new member methods

    @Override
    public void Add_New_Member() {



        //asking the user if he/she would like to choose the category in which the member should  be in


        for (int i = 0; i < 100; i++) {

            String member_choice = "";

            System.out.println("Enter 1 (Default) to assign members in default member section\n" +
                    "Enter 2 (Student) to assign members in student member section\n" +
                    "Enter 3 (Over60) to assign members in Over_60 member section\n");
            member_choice = sc.next();
// if manager chooses default member
            if (member_choice.equals("1")) {


                if (count < 100) {


                    for (String option = ""; option.equals("yes") || count < 100; count++) {

//making temp variables
                        String temp_member_name = "";
                        String temp_member_number = "";
                        String temp_admission_day = "";
                        String member1="Def";
                        // making Def_obj default type
                        Default_members Def_obj = new Default_members(member1,temp_member_name, temp_member_number, temp_admission_day);

                        System.out.println("Enter new member name: ");
                        temp_member_name = sc.next();
                        System.out.println("Enter new member id: ");
                        temp_member_number = sc.next();
                        System.out.println("Enter new admission date (dd/mm/yyyy): ");
                        temp_admission_day = sc.next();

//setting the inputs into Def_obj
                        Def_obj.setMember_name(temp_member_name);
                        Def_obj.setMember_number(temp_member_number);
                        Def_obj.setAdmission_day(temp_admission_day);
                        Def_obj.setMember(member1);
                        //adding all values from Def_obj into list
                        // this process is used for the other 2 choice respectively

                        member_list.add(Def_obj);





                        System.out.println("Do you want to add more members? Type yes(in simple) for yes or any other character to leave.\n NOTE: DO NOT TYPE ALL LETTERS IN CAPITAL!");
                        option = sc.next();
                        if (option.equals("yes")) {
                            continue;
                        } else {
                            break;
                        }


                    }
                    Main.main(null);

                } else {
                    System.out.println("No more space left in your database. all 100 are full");

                }
                Main.main(null);
            } else if (member_choice.equals("2")) {
                if (count < 100) {


                    for (String option = ""; option.equals("yes") || count < 100; count++) {


                        String temp_member_name = "";
                        String temp_member_number = "";
                        String temp_admission_day = "";
                        String temp_school_name = "";
                        String member1="stu";
                        Student_members Stu_obj = new Student_members(member1,temp_school_name, temp_member_name, temp_member_number, temp_admission_day);

                        System.out.println("Enter new member name: ");
                        temp_member_name = sc.next();
                        System.out.println("Enter new member id: ");
                        temp_member_number = sc.next();
                        System.out.println("Enter new admission date (dd/mm/yyyy): ");
                        temp_admission_day = sc.next();
                        System.out.println("Enter students School's name: ");
                        temp_school_name = sc.next();


                        Stu_obj.setMember_name(temp_member_name);
                        Stu_obj.setMember_number(temp_member_number);
                        Stu_obj.setAdmission_day(temp_admission_day);
                        Stu_obj.setSchool_name(temp_school_name);
                        Stu_obj.setMember(member1);


                        member_list.add(Stu_obj);

                        System.out.println("Do you want to add more members? Type yes(in simple) for yes or any other character to leave.\n NOTE: DO NOT TYPE ALL LETTERS IN CAPITAL!");
                        option = sc.next();
                        if (option.equals("yes")) {
                            continue;
                        } else {
                            break;
                        }


                    }
                    Main.main(null);

                } else {
                    System.out.println("No more space left in your database. all 100 are full");



                }
                Main.main(null);


            } else if (member_choice.equals("3")) {
                if (count < 100) {


                    for (String option = ""; option.equals("yes") || count < 100; count++) {


                        String temp_member_name = "";
                        String temp_member_number = "";
                        String temp_admission_day = "";
                        int temp_member_age = 0;
                        String member1="over";
                        over_60_members over_obj = new over_60_members(member1,temp_member_name, temp_member_number, temp_admission_day, temp_member_age);

                        System.out.println("Enter new member name: ");
                        temp_member_name = sc.next();
                        System.out.println("Enter new member id: ");
                        temp_member_number = sc.next();
                        System.out.println("Enter new admission date (dd/mm/yyyy): ");
                        temp_admission_day = sc.next();
                        System.out.println("Enter age of member: ");
                        temp_member_age = sc.nextInt();

                        over_obj.setMember(member1);
                        over_obj.setMember_name(temp_member_name);
                        over_obj.setMember_number(temp_member_number);
                        over_obj.setAdmission_day(temp_admission_day);
                        over_obj.setMember_age(temp_member_age);


                        member_list.add(over_obj);






                        System.out.println("Do you want to add more members? Type yes(in simple) for yes or any other character to leave.\n NOTE: DO NOT TYPE ALL LETTERS IN CAPITAL!");
                        option = sc.next();
                        if (option.equals("yes")) {
                            continue;
                        } else {
                            break;
                        }


                    }
                    System.out.println("save file before leaving");
                    Main.main(null);

                } else {
                    System.out.println("No more space left in your database. all 100 are full");


                }
                Main.main(null);


            }
        }
    }


        @Override
        // method for deleting files
        public void Delete_Old_Member (String member_number){


            String DeleteMem = "";
            System.out.println("Enter the member number/ ID of the member you want deleted");
            DeleteMem = sc.next();


            for (int d = 0; d < member_list.size(); d++) {
// process to check if search values in list
                if ((((member_list.get(d)).getMember_number()).equals(DeleteMem))) {
                    System.out.println("member deleted\n");
//delete matched value
                    member_list.remove(d);


                } else {
                    System.out.println("Member not found or not in the system\n");


                }

            }
            System.out.println("!! please save file before leaving !!");
            Main.main(null);


        }







        @Override
        public void list_of_members ()  {



                for (int count1 = 0; count1 < member_list.size(); count1++) {
                    String type = member_list.get(count1).getMember();

                    if (type == "Def") {

//adding default member types from lists into Def_obj
                        Default_members Def_obj = null;
                        Def_obj = member_list.get(count1);


                        System.out.println("Default member's shown below\n");
                        System.out.println("Membership number is: " + Def_obj.getMember_number());
                        System.out.println("Membership type is: " + Def_obj.getMember());
                        System.out.println("Membership admission date is: " + Def_obj.getAdmission_day());
                        System.out.println("Member name  is: " + Def_obj.getMember_name() + "\n");


                    } else if (type == "stu") {
                        Default_members Def_obj;
                        Student_members stu_obj;
                        //adding default member types from lists into Def_obj
                        Def_obj = member_list.get(count1);
                        /* since all the data collected are under the main default type, we are to extract the student type
                        *and put in stu_obj
                        */
                        stu_obj = (Student_members) Def_obj;

                        System.out.println("Student member's shown below\n");
                        System.out.println("Membership number is: " + stu_obj.getMember_number());
                        System.out.println("Membership type is: " + stu_obj.getMember());
                        System.out.println("Membership admission date is: " + stu_obj.getAdmission_day());
                        System.out.println("Member name  is: " + stu_obj.getMember_name() + "\n");

                    } else if (type == "over") {
                        Default_members Def_obj;
                        over_60_members over_obj;
                        Def_obj = member_list.get(count1);
                        /* since all the data collected are under the main default type, we are to extract the over 60 type
                        *and put in over_obj
                        */
                        over_obj = (over_60_members) Def_obj;

                        System.out.println("over age 60 member's shown below\n");
                        System.out.println("Membership number is: " + over_obj.getMember_number());
                        System.out.println("Membership type is: " + over_obj.getMember());
                        System.out.println("Membership admission date is: " + over_obj.getAdmission_day());
                        System.out.println("Member name  is: " + over_obj.getMember_name() + "\n");

                    }
                }
                Main.main(null);

        }


        public void Sort_ascending () {
        //turning arraylist into an array
        Default_members[] objArray = member_list.toArray(new Default_members[0]);
        System.out.println("Elements in Array :");
// bubble sort
        for (int i = 0; i < objArray.length - 1; i++) {
            for (int j = 0; j < objArray.length - (i + 1); j++) {
                if (objArray[j].getMember_name().compareTo(objArray[j + 1].getMember_name()) > 0) {
                    Default_members temp_array = objArray[j];
                     objArray[j] = objArray[j + 1];
                    objArray[j + 1] = temp_array;
                }
            }
        }
        for (int count1 = 0; count1 < objArray.length; count1++) {
            String type = objArray[count1].getMember();

//sorting via type of member
            if (type == "Def") {


                Default_members Def_obj1 = null;
                Def_obj1 = objArray[count1];
                System.out.println("======================Default=======================\n\n");

                System.out.println("Default member's shown below\n");
                System.out.println("Membership number is: " + Def_obj1.getMember_number());
                System.out.println("Membership type is: " + Def_obj1.getMember());
                System.out.println("Membership admission date is: " + Def_obj1.getAdmission_day());
                System.out.println("Member name  is: " + Def_obj1.getMember_name() + "\n");


            } else if (type == "stu") {
                Default_members Def_obj1;
                Student_members stu_obj1;
                Def_obj1 = objArray[count1];
                stu_obj1 = (Student_members) Def_obj1;
                System.out.println("======================Student=======================\n\n");

                System.out.println("Student member's shown below\n");
                System.out.println("Membership number is: " + stu_obj1.getMember_number());
                System.out.println("Membership type is: " + stu_obj1.getMember());
                System.out.println("Membership admission date is: " + stu_obj1.getAdmission_day());
                System.out.println("Member name  is: " + stu_obj1.getMember_name() + "\n");

            } else if (type == "over") {
                Default_members Def_obj1;
                over_60_members over_obj1;
                Def_obj1 = objArray[count1];
                over_obj1 = (over_60_members) Def_obj1;
                System.out.println("======================Over 60=======================\n\n");

                System.out.println("over age 60 member's shown below\n");
                System.out.println("Membership number is: " + over_obj1.getMember_number());
                System.out.println("Membership type is: " + over_obj1.getMember());
                System.out.println("Membership admission date is: " + over_obj1.getAdmission_day());
                System.out.println("Member name  is: " + over_obj1.getMember_name() + "\n");
            }
        }

        System.out.println("Values have been sorted\n");
        Main.main(null);

    }








        @Override
        public void save_member () {




//creating file
                File binary_file = new File("Gym_info");

            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(binary_file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(fos);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            System.out.println("member/members data saved");
                for(int no=0;no<member_list.size();no++){
                    try {
                        oos.writeObject(member_list.get(no));
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }


                }


        }

        @Override
        public List<Default_members> get_member_list () {


        return null;
    }

        @Override
        public Default_members Search (String member_number){
        return null;
    }


}






