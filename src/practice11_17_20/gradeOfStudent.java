package practice11_17_20;

public class gradeOfStudent {
    public static void main(String[] args) {
         gradecalculator(60);
    }







  public static void gradecalculator(int score) {
      System.out.println((score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':"F");

  }



}
