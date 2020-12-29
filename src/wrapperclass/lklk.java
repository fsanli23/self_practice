package wrapperclass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class lklk {

    public static void main(String[] args) {

      /*int[]  numbers={2,5,7};

        System.out.println(numbers[2]);*/

String [] names= {"franklin","delano","rosevelt"};

        //System.out.println(names[0]);
/*int nu=6;
        for (int i=0;i< 7;i++){
            System.out.print(i);
        }*/

       // System.out.print(names.length);
       // System.out.println(numbers.length);

       /* for (String item:names){
            System.out.print(item);
        }

for (int i=0;i< names.length;i++) {
    System.out.print(names[i]);
}
*/

       /* int[] targetarrayobject={11,4,6};
        int targetobjecttosearch=4;
*/
       /* Arrays.sort(targetarrayobject);


        Scanner input=new Scanner(System.in);

Arrays.toString(targetarrayobject);*/


int[] intarray={2,15,7,1,3};

Arrays.sort(intarray);

//for (int item:intarray){
  //  System.out.print(item);
        for (int i=0;i<intarray.length;i++){
            System.out.println(intarray[i]);
}
//for (int item:intarray){
  //  System.out.print(item);
//}
        System.out.println(Arrays.binarySearch(intarray,4));

        System.out.println(Arrays.binarySearch(intarray,15));


      String[]  lastnames={"black","white","arrow","beesley","12aa","12ab","@12aa","AA","$","aa"};

        Arrays.sort(lastnames);
for (String item:lastnames){

    System.out.println(item);


}




    }
}
