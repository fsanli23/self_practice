package practice11_05_20;

public class frequencyChar2 {
    public static void main(String[] args) {

      String text="dallas texas";
      String result="";
      for (int i=0;i<=text.length()-1;i++){
          char eachchar=text.charAt(i);
          int count =0;
          for (int j=0;j<=text.length()-1;j++){
              char re=text.charAt(j);
              if (eachchar==re){
                  count++;

              }
          }
if (!result.contains(""+eachchar)){
    result+=""+eachchar+count;
 }


      }

        System.out.println(result);


    }
}






