package arrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class frequencyofchar2 {
    public static void main(String[] args) {

    String str="werrtwerrtwer"  ;
    String result="";
    ArrayList<Character>list=new ArrayList<>();
    for (char each:str.toCharArray()){
        list.add(each);
    }
        for (char each:list){
            int f=Collections.frequency(list,each);
            if (!result.contains(""+each)){
                result+=""+f+each;
            }
        }

        System.out.println(result);






    }
}
