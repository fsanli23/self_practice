package javaprictece_11_09_20;

public class uniqString {
    public static void main(String[] args) {
        String[] arr = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for (String  each:arr) {
            int count=0;
            for (int i=0;i<=arr.length-1;i++){
                if (each.equalsIgnoreCase(arr[i])){
                    count++;
                }
            }
            if (count >1) {

                System.out.println(each+","+count);
            }
        }





    }
}
