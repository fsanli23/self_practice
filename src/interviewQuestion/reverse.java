package interviewQuestion;

public class reverse {
    public static void main(String[] args) {
        //Write a return method that can reverse  String
        //
        //Ex: Reverse("ABCD"); ==> DCBA

        String str="ABCD";
        String reverse="";
        for (int i=str.length()-1;i>=0;i-- ){
            reverse+=str.charAt(i);
        }

        System.out.println(reverse);




    }
}
