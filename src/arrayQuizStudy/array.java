package arrayQuizStudy;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        double[] arr2 = {1.5,0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5 };
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 3, 2};

      //  Arrays.sort(a1);  //[1, 2, 3]
        //Arrays.sort(a2);  //[1, 2, 3]

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

String[] names={"fatih","Resul","mehtap","serap","1ahap","@elek"};

Arrays.sort(names);

 String h=Arrays.toString(names);
        System.out.println(h);


        String str = "aaabbc";
String nonDup="";
        for(int i = 0; i < str.length(); i++ ){ //i: 0,1,2,3,4,5
            String eachChar = ""+ str.charAt(i); // a, a, a, b, b, c
            if( !nonDup.contains(eachChar) ){
                nonDup += eachChar;
            }
        }

        System.out.println(nonDup);

        String result = "";  // "a3b2c1"

String fruit="banana is very healy fruit";
 String[] arr=fruit.split("z");
        System.out.println(Arrays.toString(arr));
        System.out.println("==============");
String strk="cybertek";
for (int i=0;i<=strk.length();i+=2){
    System.out.println(strk.charAt(i));
}

    }
}
