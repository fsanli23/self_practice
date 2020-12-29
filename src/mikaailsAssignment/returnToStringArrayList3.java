package mikaailsAssignment;

import java.util.ArrayList;
import java.util.List;

public class returnToStringArrayList3 {
    public static void main(String[] args) {

        System.out.println(StrintgToArrList("michael"));

    }


    public static ArrayList<String> StrintgToArrList(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= str.length() - 1; i++) {
            list.add(str.charAt(i) + "");
        }
        return list;
    }
}
