package practice_11_18_20;

public class newclass {
    public static void main(String[] args) {

        String name="fatih sanliu";

        String single="";
for (int i=0;i<=name.length()-1;i++){
    int    count=0;
    char eachchar=name.charAt(i);
    for (int j=0;j<=name.length()-1;j++){
        if (eachchar==name.charAt(j)){
           count++; }

    }
    if (count>1){
        if (single.contains(""+eachchar));
        single+=eachchar;
    }
}
        System.out.println(single);






    }
}
