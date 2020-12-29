package day38_static;

import day37.student;

public class studentclass {
    public static void main(String[] args) {


        cybertek student1 = new cybertek("sala",2,123,'n');
        cybertek student2=new cybertek("tara",5,456,'h');
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println(cybertek.schoolName);


        System.out.println(student1);
        System.out.println(student2);
        student1.setInfo("fatih",35,21,'m');
        student2.setInfo(null,0,1,'\u0000');

    }
}
