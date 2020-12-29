package Arraylist;

import java.util.ArrayList;

public class listPractice4 {
    public static void main(String[] args) {



        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(10);
        list.add(50);

        int n1 = list.indexOf(10);  // 0
        int n2 = list.lastIndexOf(10); //5
        System.out.println(n1);
        System.out.println(n2);

        System.out.println(  !list.contains(60) );

        System.out.println(  list.contains(40));

        System.out.println("===================================================================");



        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');

ArrayList<Character>nondup=new ArrayList<>();

for (Character each:characters){

    if (!nondup.contains(each)){
        nondup.add(each);

    }

    }System.out.println(nondup);



}




    }

