package practice11_06_20;

public class palindrome {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};

int palindrome=0;
for (int i=0;i<= names.length-1;i++){
    String original=names[i];
    String reverse="";
    for (int j=original.length()-1;j>=0;j--){
        reverse+=original.charAt(j);
    }
    if (original.equalsIgnoreCase(reverse)){
        palindrome++;
        System.out.println(original);
    }
}





    }
}
