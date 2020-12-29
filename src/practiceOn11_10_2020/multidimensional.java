package practiceOn11_10_2020;

public class multidimensional {
    public static void main(String[] args) {


        int[][] arr2D = {{1, 2, 3, 4}, {5, 600}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15, 16, 17}};

// find the minumm maxinum

        int max = arr2D[0][0];
        int min = arr2D[0][0];


        for (int[] eacharr : arr2D) {
            for (int eachno : eacharr) {
                if (eachno > max) {
                    max = eachno;
                }
                if (eachno < min) {
                    min = eachno;
                }
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        
    }
}
