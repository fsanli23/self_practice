package arrayList2;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;

public class warmaup {
    public static void main(String[] args) {

      /*  1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0];

*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(list.size() - 1, 0);
        System.out.println(list);


        System.out.println("============================================");
        /*2. write a program that can multiply each odd number by 2
        ex:
        list = [1,2,3,4,5];
        output: [2,2,6,4,10]*/

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        for (int i = 0; i <= list1.size() - 1; i++) {
            int each = list1.get(i);
            if (each % 2 != 0) {
                list1.set(i, each * 2);
            }
        }

        System.out.println(list1);
        System.out.println("=============================================================");


        int[] scores = {65, 75, 77, 85, 68, 88, 82, 72, 95, 99, 98, 94, 93, 96, 97, 71, 70, 72, 72, 73, 55};

        ArrayList<Integer> Alist = new ArrayList<>();
        ArrayList<Integer> Blist = new ArrayList<>();
        ArrayList<Integer> Clist = new ArrayList<>();
        ArrayList<Integer> Dlist = new ArrayList<>();
        ArrayList<Integer> Flist = new ArrayList<>();

        for (int each : scores) {
            if (each >= 0 && each <= 100) {
                if (each > 90) {
                    Alist.add(each);
                } else if (each > 80) {
                    Blist.add(each);
                } else if (each > 70) {
                    Clist.add(each);
                } else if (each > 60) {
                    Dlist.add(each);
                } else {
                    Flist.add(each);
                }
            }
        }

        System.out.println("Alist = " + Alist);
        System.out.println("Blist = " + Blist);
        System.out.println("Clist = " + Clist);
        System.out.println("Dlist = " + Dlist);
        System.out.println("Flist = " + Flist);
        
        
        
        

    }
}
