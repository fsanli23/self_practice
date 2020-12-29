package practice11_04_20;

public class  removeduplicate {
    public static void main(String[] args) {

        String str="aabbccdddf";
        String nondup="";
        for (int i =0;i<str.length();i++) {
            String each = "" + str.charAt(i);
            if (!nondup.contains(each)) {
                nondup += each;
            }
        }
            System.out.println(nondup);








    }
}
