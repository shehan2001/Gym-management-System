package sample;

public class Date {
    private int day;
    private int month;
    private int year;




    public  Date(String member_name,String admission_day,String member_number){
        super();
        this.day=day;
        this.month=month;
        this.year=year;

    }


    public int getDay(){
        return day;


    }

    public void setDay(int days) {

        try {
            if ((days <= 31) && (days >= 1)) {
                this.day = days;

            } else {
                System.out.println("you cant have more than 31 days in a month");

            }
        } catch (Exception e) {
            System.out.println("wrong data type. Entries should be in integer form");
        }
    }

    public int getMonth(int month){
     return month;
    }

    public void setMonth(int months){

            try {

            if ((months <= 12) && (months >= 1)) {
                this.month = months;

            } else {
                System.out.println("you cant have more than 12 months in an year ");

            }
        }
            catch (Exception e){
                System.out.println("Wrong data type. Entries should be in integer form");
            }
    }

    public int getYear(int year){
    return year;
    }

    public void setYear(int years){
        try{
                this.year = years;
        }
        catch (Exception e){
            System.out.println("Wrong data type. Entries should be in integer form");
        }

    }
}

