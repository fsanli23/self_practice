package javaprictece_11_09_20;

public class oddeven {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("even nunbers");
        for (int each:numbers) {
            if (each % 2 == 0) {

                System.out.print(each + ",");
            }

        }
        System.out.println();
        System.out.println("odd numbers");
        for (int each:numbers ) {
            if (each%2!=0){
                System.out.print(each+",");
            }

        }




    }
}
