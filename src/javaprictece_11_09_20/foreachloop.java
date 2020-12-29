package javaprictece_11_09_20;

import java.util.Arrays;

public class foreachloop {
    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        System.out.println(Arrays.toString(names));

for (int i=0;i<=names.length-1;i++){
    System.out.println(names[i]);
}


        for (String each:names) {
            System.out.print
                    (each);

        }
        System.out.println("=====================================================================");

     /*   int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};//find ood and even number

        int [] even=new int[];



        for (int each:numbers) {
             if (each%2==0){
                 System.out.println(each);
             }if (each%2!=0){
                System.out.println(each);
            }

        }
*/


String even="";
for (int j=0;j<=10;j++) {
    if (j % 2 == 0) {
        System.out.print(even+=j);
    }
    System.out.println();
    if (j % 2 != 0) {
        System.out.print("odd=" + j);
    }

}














    }
}
