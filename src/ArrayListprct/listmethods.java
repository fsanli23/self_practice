package ArrayListprct;

import java.util.ArrayList;

public class listmethods {
    public static void main(String[] args) {



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(600);
        list1.add(200);
        list1.add(300);

        list1.set(1,400);

        System.out.println(list1);
        System.out.println("==============================================================");



        ArrayList<String> names = new ArrayList<>();
        names.add("Yalcin");
        names.add("Amina");
        names.add("Ercan");
        names.add("Ercan");
        names.add("Tayfun");
        names.add("Mustafa");
        names.add("Tayfun");
        names.add("Suveyda");
        names.add("Egemen");



        System.out.println(names);



        System.out.println("===================================================");
ArrayList<Character>list=new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');







        System.out.println(list);

        System.out.println("=====================================");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        //  Character ch = 'C';

        boolean r1 =  list2.remove( Character.valueOf('A')  ); // 67

        System.out.println(list2);
        System.out.println(r1);



        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(6);
        System.out.println(num);
        num.remove(Integer.valueOf(1));

        System.out.println(num);
        System.out.println(num.get(2));

    }
}
