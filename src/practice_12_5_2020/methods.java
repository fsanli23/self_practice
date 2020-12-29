package practice_12_5_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class methods {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>(Arrays.asList("hi","hello","ho","hi","jo"))   ;
        ArrayList<String>list1=new ArrayList<>(Arrays.asList("hi","hello","ho","hi","jo"))   ;
//
ArrayList<String>k=combiner(list1,list);
        System.out.println(k);

    }

    public static void removeAll(ArrayList<String>wordList,String targetWord){
        wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);
    }

    public static ArrayList<String> combiner(ArrayList<String>wordList1,ArrayList<String>wordList2){
        ArrayList<String>list=new ArrayList<>();
        for(String each:wordList1){
            list.add(each);
        }
        for(String each:wordList2){
            list.add(each);
        }


        return   list;
    }

    public static void timesTwo(ArrayList<Integer>nums) {

        for (int i=0;i<=nums.size()-1;i++){
            nums.set(i, nums.get(i)*2);

        }








    }
}
