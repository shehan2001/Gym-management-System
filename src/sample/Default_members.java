package sample;

import java.io.Serializable;
import java.util.Scanner;

public  class Default_members implements Serializable {
    private String member="";
    private  String member_name ="";
    private  String member_number="";
    private  String admission_day="";

//super class Default members
    public   Default_members(String member,String member_name,String member_number,String admission_day){
        super();
        this.member=member;
        this.member_name=member_name;
        this.member_number=member_number;
        this.admission_day=admission_day;


    }
    //setting and getting relevant variables
    public String getMember(){
        return member;
    }
    public void setMember(String mem){
        this.member=mem;
    }


    public  String getMember_name(){
        return member_name;


    }

    public void setMember_name(String name) {
        try {
            this.member_name = name;
        }catch (Exception e){
            System.out.println("Wrong dataType. Enter String values");
        }

    }

    public  String getMember_number(){
        return member_number;


    }

    public void setMember_number(String number) {
        try {
            this.member_number = number;

        }
        catch (Exception e){
            System.out.println("You have entered the wrong dataType. please re-enter a String value");
        }

    }

    public String getAdmission_day(){
        return admission_day;


    }

    public void setAdmission_day(String day) {
        try {
            this.admission_day = day;
        }
        catch (Exception e){
            System.out.println("Wrong dataType was entered. please re-enter with a string integer");
        }

    }



}
