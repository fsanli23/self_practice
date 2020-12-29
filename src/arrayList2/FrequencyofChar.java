package arrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyofChar {
    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE"; // A3B2C1D4E3
        String result = "";
        ArrayList<Character> list = new ArrayList<>();


        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            list.add(each);
        }
        for (Character each : list) {
            int frq = Collections.frequency(list, each);
            if (result.contains("" + each)) {
                continue;
            }
            result += "" + frq + each;
        }
        System.out.println(result);









    }
}
