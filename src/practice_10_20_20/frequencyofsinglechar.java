package practice_10_20_20;

public class frequencyofsinglechar {
    public static void main(String[] args) {

        String word="today is monday it is a boring day most of the time";

int count=0;
        for (int i=0;i<=word.length()-1;i++){

            if (word.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);




    }
}
