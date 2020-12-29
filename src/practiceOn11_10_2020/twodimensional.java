package practiceOn11_10_2020;

public class twodimensional {
    public static void main(String[] args) {
        int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

       /* 9 10 11 12 13
        4 5 6 7 8
        1 2 3
*/

for (int i =0;i<=arr2D.length-1;i++){
int[] but=arr2D[i];
    System.out.println();
for (int j=but.length-1;j>=0;j--){
    System.out.print(but[j]+" ");
}
}







       /* 3 2 1
        8 7 6 5 4
        13 12 11 10 9
*/


     /*   for (int [] eacharr:arr2D ) {
            System.out.println();
            for (int i=eacharr.length-1;i>=0;i--){
                System.out.print(eacharr[i]+" ");
            }

        }*/














      /*  for (int [] eacharr:arr2D) {
            System.out.println();
            for (int eachelment:eacharr){
                System.out.print(eachelment+" ");
            }

        }*/







      /*  for (int i= arr2D.length-1; i >= 0 ; i-- ){// i: index of 1D arrays
            for( int each  : arr2D[i] ){
                System.out.print(each+" ");
            }
            System.out.println();
        }
*/







    }
}
