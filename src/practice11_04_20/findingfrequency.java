package practice11_04_20;

public class findingfrequency {
    public static void main(String[] args) {

        String str="i love java programming";

        char c='m';
        int count=0;

        for (int i =0;i<str.length();i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(count);


String word="hello everyonel";

char ch='l';
int freq=0;


for (int j=0;j<word.length();j++){
    if (word.charAt(j)==ch){
        freq++;
    }
}
        System.out.println(freq);











    }
}
