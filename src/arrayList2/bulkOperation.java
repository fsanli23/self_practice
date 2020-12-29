package arrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperation {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

list.remove(Integer.valueOf(8));
        System.out.println(list);


        System.out.println(list.contains(0));
        System.out.println(list.containsAll(Arrays.asList(0,2,3,4,5,6,7,8,9)));












    }
}
