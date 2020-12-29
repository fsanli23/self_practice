package arrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class uniques {
    public static void main(String[] args) {


        String str = "aabaacddddefffffghhhhhi";

        ArrayList<Character>list=new ArrayList<>();


for (int i=0;i<=str.length()-1;i++){
    char each=str.charAt(i);
    list.add(each);



}

for (Character each:list){
    if (Collections.frequency(list,each)==1){
        System.out.println(each);
    }
}

String single ="";

for (int i=0;i<=str.length()-1;i++){
     int count=0;
    char each=str.charAt(i);
    for (int j=0;j<=str.length()-1;j++){
        if (each==str.charAt(j)){
           count++;

        }
    }
    if (count==1){
        single+=each;
    }
}
        System.out.println(single);








    }
}
