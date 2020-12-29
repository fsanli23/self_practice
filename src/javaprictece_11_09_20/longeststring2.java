package javaprictece_11_09_20;

public class longeststring2 {
    public static void main(String[] args) {

        String[] names = {"Elenora", "Evelyna", "Apple", "Pear", "Vale", "Ruslana", "Jair" };

//what  is the longest and shortest string/

int max=names[0].length();
int min=names[0].length();

for (int i=0;i<=names.length-1;i++){
if (names[i].length()>max){
    max=names[i].length();
    System.out.println(names[i]);
}
if (names[i].length()<min){
    min=names[i].length();
    System.out.println(names[i]);
}
}
        System.out.println(min);
        System.out.println(max);
    }
}
