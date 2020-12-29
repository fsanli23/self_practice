package wrapperclass;

public class loopArray {
    public static void main(String[] args) {

       /* 0-2~infant
            3-4baby
            5-10pre teen
            11-19 teen
            20-40 adult*/
int age=25;

if (age>0&&age<41){


    String agegroup=(age>0&&age<2)?"infant":(age>3&&age<=4)?"baby":(age>5&&age<10)?"pre teen":"invalid";


    System.out.println(agegroup);

    }




    }
}
