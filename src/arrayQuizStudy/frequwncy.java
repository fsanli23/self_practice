package arrayQuizStudy;

public class frequwncy {
    public static void main(String[] args) {


        String str = "aaabbc";  // "a3b2c1"
String nondup="";
for (int i=0;i<=str.length()-1;i++){
    if (!nondup.contains(""+str.charAt(i))){
        nondup+=str.charAt(i);
    }
}
        System.out.println(nondup);

for (int i=0;i<=nondup.length()-1;i++){
    char eachchar=nondup.charAt(i);
        int count=0;
        for (int j=0;j<=str.length()-1;j++){

            if (eachchar==str.charAt(j)){
                count++;}

        }
    System.out.print(""+count+eachchar);
}


    }
}
