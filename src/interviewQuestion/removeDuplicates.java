package interviewQuestion;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class removeDuplicates {

    //Write a return method that can remove the duplicated values from String
    //
    //Ex:  removeDup("AAABBBCCC")  ==> ABC
    public static void main(String[] args) {

        System.out.println(removeDuplicate("AAAABBBCCC") ); ;



    }





    public static String removeDuplicate(String str){
        String nonDup="";

        for (int i=0;i<=str.length()-1;i++){
            //int count=0;
            if (!nonDup.contains(str.charAt(i)+"")){
                nonDup+=str.charAt(i);
            }
        }



        return nonDup;

    }




}
