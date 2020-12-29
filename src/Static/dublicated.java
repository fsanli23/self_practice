package Static;

import java.util.ArrayList;

public class dublicated {
    public static void main(String[] args) {

    }
    public static ArrayList twoTimes(ArrayList<Integer>List1){
        ArrayList<Integer>List2=new ArrayList<>();
        for(Integer each:List1){
            List2.add(each);
            List2.add(each);
        }


        return List2;
    }
}
