package arrays;

public class FinRa {
    public static void main(String[] args) {
        /*System.out.println();
        5. Write a method which prints out the numbers from 1 to 100 but
        for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
        for numbers which are a multiple of 3, print "FIN" instead of the number and
        for numbers which are a multiple of 5, print "RA" instead of the number.
        ex:
        output:
        1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....*/

        for (int i =1 ;i<=100;i++){
            System.out.print((i%3==0&&i%5==0)?"finra,":(i%3==0)?"fin,":(i%5==0)?"ra,":i+",");
        }

        System.out.println("=============================================");


        for (int i=1;i<=100;i++){
            if (i%3==0&&i%5==0){
                System.out.println("finra,");
            }
           else if (i%3==0){
                System.out.print("fin,");
            }
           else if (i%5==0){
                System.out.print("ra,");
            }else {
                System.out.print(i+",");
            }
        }
        System.out.println();




    }
}
