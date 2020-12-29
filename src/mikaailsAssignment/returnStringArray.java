package mikaailsAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class returnStringArray {
    public static void main(String[] args) {

        System.out.println(returnArrStr("michael"));


    }


    public static ArrayList<String> returnArrStr(String str) {
        String[] strArr = str.split("");
        ArrayList<String> List = new ArrayList<>();
        List.addAll(Arrays.asList(strArr));
        return List;
    }


}
