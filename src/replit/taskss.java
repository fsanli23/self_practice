package replit;

import java.util.Scanner;

public class taskss {
    public static void main(String[] args) {
        //In this task, you need to swap first name with last name in the email.
        //If email doesn't contains underscore - do not anything.
        
      /*  String email="sanli_fatih@gmail.com";
        
        if (email.contains("_")){
            String firstname=email.substring(0,email.indexOf('_'));
            String lastname=email.substring(email.indexOf('_')+1,email.indexOf('@'));
            String swpemail=lastname+"_"+firstname+"@gmail.com";
            System.out.println(swpemail);
        }else{
            System.out.println("email = " + email);
        }
*/
       /* Write a program that will print out route instructions. Your program should take 2 parameters: start point and endpoint. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to endpoint - display: "start/end(start or end variable!) found".
                Note: you may move only clockwise.Example:
        Input: A
        Input: D
        Output: right > down > left: D found
         Input: C
        Input: C
        Output: C found
*/
       /* Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

switch (start){
    case "A":
        if (end.equalsIgnoreCase("A")) {
            System.out.println("A found");
        }else if (end.equalsIgnoreCase("B")){
            System.out.println("right: B found");
        }else if (end.equalsIgnoreCase("C")){
            System.out.println("right > down: C found");
        }else if (end.equalsIgnoreCase("d")){
            System.out.println("right > down > left: D found");
        }
        break;

    case "B":
        if (end.equalsIgnoreCase("B")) {
            System.out.println("B found");
        }else if (end.equalsIgnoreCase("C")){
            System.out.println("down: C found");
        }else if (end.equalsIgnoreCase("D")){
            System.out.println("down > left: D found");
        }else if (end.equalsIgnoreCase("A")){
            System.out.println("down > left > up: A found");
        }
        break;


    case "C":
        if (end.equalsIgnoreCase("C")) {
            System.out.println("C found");
        }else if (end.equalsIgnoreCase("D")){
            System.out.println("left: C found");
        }else if (end.equalsIgnoreCase("A")){
            System.out.println("left > up: D found");
        }else if (end.equalsIgnoreCase("B")){
            System.out.println("left > up > right: B found");
        }

        break;

    case "D":
        if (end.equalsIgnoreCase("D")) {
            System.out.println("D found");
        }else if (end.equalsIgnoreCase("A")){
            System.out.println("up: A found");
        }else if (end.equalsIgnoreCase("B")){
            System.out.println("up > right: B found");
        }else if (end.equalsIgnoreCase("C")){
            System.out.println("up > right > down: C found");
        }
        break;
*/


//}

       /* Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;*/
      /*  output: Enter Item1 and its price:
        input: Tomatoes
        input: 5.5
        output: Add one more item?
        input: yes
        output: Enter Item2 and its price:
        input: Cheese
        input: 3.5
        output: Add one more item?
        input: yes
        output: Enter Item3 and its price:
        input: Apples
        input: 6.3
        output: Add one more item?
        input: no
        output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
        output: Total price: 15.3
*/
/*
do {


    System.out.println("Enter Item" + count + " and its price:");
    item = scan.next();
    price = scan.nextDouble();
    totalPrice += price;
    //System.out.println("Add one more item?");

    shoppingListReport = "item" + count + ": " + item + " price: " + price;
    System.out.println("Add one more item?");
    countinue = scan.next();
    if (countinue.equalsIgnoreCase("yes")) {
        shoppingListReport += ", ";
        count++;
    }

}while(countinue.equalsIgnoreCase("yes")&&count<=10);

        System.out.println(shoppingListReport);

        System.out.println(totalPrice);
*/
       /* A variable inhabitants represents a city and its respective populations.
        City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
                After each day, a city will lose half of its population.
                write a program to loop the city population and make it lose half of its population until no humans left.
                Print the each day like below for each day:

        example1- inhabitants is 6

        Day 0 [6]
       // Day 1 [3]
        Day 2 [1]
                ---- EXTINCT ----
*/
      /*  Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        while (inhabitants > 0) {
            System.out.println("day " + day + " [" + inhabitants + "]");
            inhabitants = inhabitants / 2;
            day++;
        }
        System.out.println("---- EXTINCT ----");

String L="gemini";

        System.out.println(L.substring(0,1)+L.substring(L.length()-1));
*/

      /* Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


       while(word.contains("cat")){

            word=word.replaceFirst("cat,","");
            countOfCats++;
        }

        while(word.contains("dog")){

            word=word.replaceFirst("dog,","");
            countOfDogs++;
        }


        System.out.println(countOfCats==countOfDogs);*/

/*Scanner scan =new Scanner(System.in);
String word=scan.nextLine();
int dogcount=0;
        int catcount=0;
    //  String h="ihavecatandialsoihavedogilikecatbetterdogbarks";
      while(word.contains("cat")){
          catcount++;

          word=word.replaceFirst("cat","");
      }

        //System.out.println(h);
       // System.out.println(catcount);

        while(word.contains("dog")){
            dogcount++;
            word=word.replaceFirst("dog","");
        }

        //System.out.println(word);
       // System.out.println(dogcount);
        System.out.println(dogcount==catcount);*/


      /*  Scanner s = new Scanner(System.in);
        String txt = s.next();
        System.out.println(txt.substring(0,txt.length()-1));*/

        /*boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word.indexOf("sunday"));
*/

        /*int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        while (isPremiumCustomer) {
            if (nbooksPurchased >= 8) {
                freeBooks += 2;
            }
            if (nbooksPurchased >= 5) {
                freeBooks++;
            }
        }

        while (!isPremiumCustomer) {
            if (nbooksPurchased >= 12) {
                freeBooks += 2;
            }
            if (nbooksPurchased >= 7) {
                freeBooks++;
            }
        }

        System.out.println(freeBooks);
*/
        /*
      char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
for (char i=start;i<=end;i++){
    System.out.print(i);
}
*/
/*for (int i=1;i<=3;i++){
    System.out.println();
    for (int j=1;j<=3;j++){
        System.out.print("*");
    }
}*//*
        String even="";
for (int i=1;i<=100;i++)
    if (i%2==0){
        even+=i+",";
    }else{
        continue;
    }

        System.out.println(even);


*/
     /*   Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i=1;i<=1;i++) {
         System.out.println();
         System.out.print("xxx");
            System.out.println();
      for (int j=1;j<=n;j++){
          System.out.println("x x");
      }
            System.out.print("xxx");
        // }
     }

*/


/*for (int i=1;i<10;i++){
    System.out.print("*");
}*//*
        Scanner scan = new Scanner(System.in);


        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
String ab=word+separator;
        for (int i = 1; i <= count-1; i++) {
            System.out.print(ab);

        }
        System.out.print(word);
*/
        /*Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
*///A, E, I, O, U
      /*  Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
String vowel="";
        for (int i=0;i<=word.length()-1;i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel += c;
            }else{continue;}


        }

        System.out.println(vowel);*/


       /* int i=0;

        while(i<=100){
            System.out.println(i);
            i++;
        }
*/

    /*for (int i=100;i>=0;i--)  {
        System.out.println(i);
    }
*/
  /*for (int i=1;i<=20;i++){
      if (i%3==0){
          System.out.println(i);
      }else{continue;}
  }
*/

/*
int i=1;
while(i<=20){
    if(i%3==0){
        System.out.println(i);
    }
    i++;
}
*/
     /*   Scanner scan= new Scanner(System.in);
        String word = scan.next();

int count =0;
//String temp="";
while (word.contains("java")){
    count++;
  word= word.replaceFirst("java","");

}

        System.out.println(count);
*/

        /*Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
int count=0;
while(str.contains("hi")){
    count++;
    str=str.replaceFirst("hi","o");
}
        System.out.println(count);
*/

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int javaCount = 0;
        int pyhtonCount = 0;
        while (sentence.contains("java")) {


            sentence = sentence.replaceFirst("java", "");
            javaCount++;
        }
        while (sentence.contains("phyton")) {


            sentence = sentence.replaceFirst("phyton", "");
            pyhtonCount++;
        }
        System.out.println(javaCount == pyhtonCount);


    }
}
