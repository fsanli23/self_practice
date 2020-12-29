package practice11_05_20;

public class frequencyofeachchar {
    public static void main(String[] args) {
      /* *//* FrequencyOfEachChars
        1. write a program that can return the frequency of characters from a String
        Ex:
        str = "ababaac";
        output:
        a3b2c1
        *//*
        String str = "aaabbc";  // "a3b2c1"

        //  Step 1: remove duplicates
        String nonDup = "";   // "abc"
        for(int i = 0; i < str.length(); i++ ){ //i: 0,1,2,3,4,5
            String eachChar = ""+ str.charAt(i); // a, a, a, b, b, c
            if( !nonDup.contains(eachChar) ){
                nonDup += eachChar;
            }
        }
       *//* String result = "";  // "a3b2c1"
        // Step 2: find the frequency of each nonDiup characters from the original string
        for(int j =0; j <= nonDup.length()-1; j++){ // j is the index num of nonDup

            char ch = nonDup.charAt(j); // a, b, c
            int count = 0;  // to contain the frequency of char ch

            for(int i=0; i <= str.length()-1; i++){ // i is the index num of original string
                char eachChar =  str.charAt(i);  // a, a, a, b, b, c
                if(ch == eachChar ){
                    count++;
                }
            }

            result +=  ""+ch + count;

        }
+


//                 'a' + 3   ==> 97 + 3 = 100
        //         ""+'a'  + 3  ==>  a3
*//*
        System.out.println(nonDup);

*/


/*String word="hip hop radio";
String nondublicate="";
for (int i=0;i<=word.length()-1;i++){
    char eachchar=word.charAt(i);
    if (nondublicate.contains(""+eachchar)){
        continue;
    }else{nondublicate+=eachchar;
    }
}
        String result="";
for (int i=0;i<=nondublicate.length()-1;i++){
    char c=nondublicate.charAt(i);
    int count=0;
    for (int j=0;j<=word.length()-1;j++){
        char k=word.charAt(j);
        if (k==c){

            count++;
        }
    }result+=""+c+count;
}

        System.out.println(result);


       // System.out.println(nondublicate);*/


      String text="dallas texas";
      String allletter="";


      for (int i=0;i<=text.length()-1;i++){
          char eachchar=text.charAt(i);
          if (allletter.contains(""+eachchar)){
              continue;
          }else{
              allletter+=eachchar;
          }
      }
        System.out.println(allletter);

String result="";
for (int j=0;j<=allletter.length()-1;j++){//letters from all letter
    char c=allletter.charAt(j);
    int count =0;
    for (int k=0;k<=text.length()-1;k++){
        char l=text.charAt(k);
        if (c==l){
            count++;
        }
    }result+=""+count+c;

}

        System.out.println("result = " + result);







    }
}
