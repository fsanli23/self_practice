package javaprictece_11_09_20;

import java.util.Arrays;

public class combineArrays {
    public static void main(String[] args) {



        String[] group1 = {"Sara", "Jesicca","Parker", "Dragisa", "Sladjan"};
        String[] group2 = {"James", "Bonda", "Indiana", "Jones","Max", "Payne"};
        String[] group3 = {"Abdul", "Sacha", "Amin", "Salih", "Jessica"};
        String[] group4 = {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvenche"};


        String [] groups =new String[group1.length+group2.length+group3.length+group4.length];
int i=0;
        for (i=0;i<=group1.length-1;i++){
            groups[i]=group1[i];
        }

        for (String each:group2){
            groups[i++]=each;
        }

        for (String each:group3){
            groups[i++]=each;
        }
        for (String each:group4  ) {
           groups[i++]=each;

        }
        System.out.println(Arrays.toString(groups));


    }
}
