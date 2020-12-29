package arrays;

public class FindingFrequency {
    public static void main(String[] args) {

     String google=   "Clicking today’s #GoogleDoodle will lead you to info on WHERE to vote in your state.\nYou can also search “how to vote” for info on different ways to vote and \nwhat to bring with you when you vote→ http://goo.gle/3oL9HT";
 int count =0;
char c=' ';
        System.out.println(google);
for (int i=0;i<=google.length()-1;i++){
 if (google.charAt(i)==c){
        count++;
    }
}

        System.out.println(count+1);


String f="hello word.it is a election day";
char looking='e';
int frte=0;
for (int i=0;i<f.length();i++){
    if (f.charAt(i)==looking){
        frte++;
    }
}
        System.out.println(frte);







    }
}
