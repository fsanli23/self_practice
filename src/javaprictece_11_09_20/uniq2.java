package javaprictece_11_09_20;

public class uniq2 {
    public static void main(String[] args) {
        String text="abbbbadccghh";


        for (int i=0;i<=text.length()-1;i++){
            int count =0;
            char eachchar=text.charAt(i);
            for (int k=0;k<=text.length()-1;k++){
                if (eachchar==text.charAt(k)){
                    count++;}


            }
            System.out.print(count+""+eachchar);

        }









    }
}
