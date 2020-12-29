package practice01;

public class studentobject {
    public static void main(String[] args) {

    cybertekSudent student1=new cybertekSudent();
cybertekSudent student2=new cybertekSudent();
student1.setInfo("fatih",36,'m');
student2.setInfo("inanc",35,'f');
        System.out.println(student1);
        System.out.println(student2);

        student2.schoolname="odtu";


        System.out.println(student1);
        System.out.println(student2);


    }
}
