package wrapperclass;

import java.util.Scanner;

public class TernaryCondition {
    public static void main(String[] args) {
        int max;
       int n1=10,n2=02;
      /* if (n1>n2){
         max=n1;
       }else{
           max=n2;
       }*/

      /* max=(n1>n2)?n1:n2;

        System.out.println(max);
*/
       /* int discount;
      int bill=2000;
      int qty=2;
      discount=(bill>1999)?(qty>9)?15:10:5;

        System.out.println(discount);
*/
/*
int restaurantRating=4;
switch(restaurantRating) {
    case 1:
        System.out.println("this restaurant is not my fav");
        break;

    case 2:
        System.out.println("this restaurant is good");
        break;
    case 3:
        System.out.println("this restaurant is fantastic");
        break;
    default:
        System.out.println("not rated yet");
        break;
}

*/


        /*String veve=new String("              i love humbergurbb.");
        String jason=new String("                    and i love pizzas.    ");
        System.out.println(veve+jason);

jason.trim();

        System.out.println(jason);
        System.out.println(jason.trim());
*/
/*int counter=1;
  int apples=9;
  while(apples<=10){
      System.out.println(counter+" eating an apple");
      apples++;
  --counter;
  }
        System.out.println("no more apple");*/

int number,count=4;
        System.out.println("enter a number");
        Scanner input=new Scanner(System.in);
number=input.nextInt();

while(count<=number){
    System.out.println(count +",");
    count++;
}













    }
}
