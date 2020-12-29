package replitpractice11_14_20;

import java.util.Scanner;

public class PrintingShortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),

                scan.next(), scan.next(), scan.next()};

int  min=str[0].length();
for (int i=0;i<=str.length-1;i++){
   if(str[i].length()<min) {
       min = str[i].length();
      // System.out.println(str[i]);
   }
}
for (int i=0;i<=str.length-1;i++){
    if (str[i].length()==min){
        System.out.println(str[i]);
    }
}












    }
}
