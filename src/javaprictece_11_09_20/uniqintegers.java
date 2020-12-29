package javaprictece_11_09_20;

public class uniqintegers {
    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4,1};

        for (int each:arr) {
            int count=0;
             for (int i=0;i<=arr.length-1;i++){
                 if (each==arr[i]){
                     count++;}

             }
            if (count == 1) {

                System.out.println(each);
            }

        }










    }
}
