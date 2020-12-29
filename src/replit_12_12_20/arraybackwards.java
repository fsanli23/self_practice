package replit_12_12_20;

import arrayQuizStudy.array;

import java.util.Arrays;

public class arraybackwards {
    public static void main(String[] args) {

       /* Write the definition of a method reverse, whose parameter is an array of Strings. The method reverses the elements of the array. The method returns an arrayQuizStudy.array of strings in the wrapperclass.reversed order.
                Example:
        input: ["apple", "pear"]
        output: ["pear", "apple"]*/

        String[] a = {"fatih", "sanli", "inanc","dallas"};
        System.out.println(Arrays.toString(reverse(a)));


    }

    public static String[] reverse(String[] arr) {
        //write your codes here
        String[] arrnew = new String[arr.length];
        for ( int i=arr.length-1,j=0;j<=arrnew.length-1;j++,i--) {

            arrnew[j] = arr[i];
        }
      return arrnew;
    }


}
