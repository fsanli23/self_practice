package wrapperclass;

import com.sun.deploy.security.SelectableSecurityManager;

public class october6thtasks {
    public static void main(String[] args) {

        /*1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".

                Note: MUST USE NESTED IF
*/

int no=5;
if (no>0&&no<9){
    if (no==0){
        System.out.println("zero");
    }else if (no==1){
        System.out.println("one");
    }else if (no==2){
        System.out.println("two");
    }else if (no==3){
        System.out.println("three");
    }else if (no==4){
        System.out.println("four");
    }else if (no==5){
        System.out.println("five");
    }else if (no==6){
        System.out.println("six");
    }else if (no==7){
        System.out.println("seven");
    }else if (no==8){
        System.out.println("eight");
    }else if (no==9){
        System.out.println("nine");
    }

}else{
    System.out.println("invaid number");
}
        System.out.println("===================================================");
        /*4. write a program that can display the selected browser
        1. declear a String variable called browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
*/
        String month="jun";
                switch(month){
                    case "january":
                        System.out.println("bingo");
                        break;
                    case "jun":
                        System.out.println("nope");
                        break;
                    case "may":
                        System.out.println("olmadi");
                        break;
                }

        System.out.println(month);


for (int m=0;m<5;m++){
    System.out.print("*");
}















    }
    }



