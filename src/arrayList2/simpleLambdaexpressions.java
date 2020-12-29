package arrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class simpleLambdaexpressions {
    public static void main(String[] args) {

int[] arr={4,5,6,8};
        System.out.println(arr.length);
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,34,5,5,6,5,7,5));
        System.out.println(numbers);


        System.out.println("=======================================================");

        //Predicate<Integer> lessthan5=each->each<5;
        //numbers.removeIf(lessthan5);
        numbers.removeIf(p->p<=5);

        System.out.println(numbers);
        System.out.println("==================================================");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18, 19, 20) );
scores.removeIf(p->p%3==0||p%5==0);
        System.out.println(scores);

        System.out.println("==============================================");
        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(  Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz") );

employees2.removeIf(p->p.contains("j")||p.equalsIgnoreCase("Ahmed"));
        System.out.println(employees2);













    }
}
