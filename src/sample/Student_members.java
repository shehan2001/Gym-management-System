package sample;

public class Student_members extends Default_members{

    private  String school_name="";

//sub classes of Default_member
    public Student_members(String member,String member_name,String member_number,String admission_day,String school_name){
        super(member, member_name, member_number, admission_day);
        this.school_name=school_name;



    }//setting ang getting

    public String getSchool_name(){

        return school_name;
    }

    public void setSchool_name(String school){
        try{
        this.school_name=school;
    }
        catch (Exception e){
        System.out.println("Wrong data type. input string value's");
        }
    }


}
