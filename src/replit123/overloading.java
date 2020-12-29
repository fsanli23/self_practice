package replit123;

public class overloading {
    public static void main(String[] args) {

int [] nums={1,2,3,4,8,9,6,};
double[] sayi={8,9,6,3,25};

        System.out.println(findMax(sayi));
        System.out.println(findMax(sayi));
    }



    public static int findMax(int [] arr){
        int max=arr[0];
        for (int each:arr){
            if (each>max){
                max=each;
            }
        }return max;
    }
    public static double findMax(double[] arr){
        double max=arr[0];
        for (double each:arr){
            if (each>max){
                max=each;
            }
        }return max;
    }
}
