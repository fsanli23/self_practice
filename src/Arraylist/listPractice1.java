package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class listPractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();


        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                odd.add(i);
            } else {
                even.add(i);
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);


        System.out.println("=======================================");
        int lastoddno=odd.get(odd.size()-1);
        int lastevenno=even.get(even.size()-1);
        System.out.println(lastoddno);
        System.out.println(lastevenno);

        System.out.println("===========================================");

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = {90, 80, 70, 60};
        int[] arr4 = {40, 35, 45, 65, 7, 5};
        int[] arr5 = {35, 54, 67, 89, 98, 89, 76};


int [][] multiArr={arr1,arr2,arr3,arr4,arr5};

ArrayList<Integer>list3=new ArrayList<>();

for (int [] eacharr:multiArr){
    for (int eachelemnt:eacharr){
        list3.add(eachelemnt);
    }
}
        System.out.println(list3);











    }
}
