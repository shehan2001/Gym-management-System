package sample;

public class over_60_members extends Default_members {

    private  int member_age=0;
//subclass of Default members

    public over_60_members(String member,String member_name,String member_number,String admission_day,int member_age){
        super( member, member_name,member_number, admission_day);
        this.member_age=member_age;



    }
//setting and getting
    public int getMember_age(){

        return member_age;
    }

    public void setMember_age(int age){
        try {
            if ((age >= 60)) {
                this.member_age = age;
            }else{
                System.out.println("Age has to be above 60");
            }
        }catch (Exception E){

            System.out.println("Wrong data type. Enter in integer datatype");

        }
    }


}




