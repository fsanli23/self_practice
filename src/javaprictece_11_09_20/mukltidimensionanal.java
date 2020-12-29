package javaprictece_11_09_20;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Arrays;

public class mukltidimensionanal {
    public static void main(String[] args) {


        int[][]  arr2D1 = {{1,2,3},{4,5,6,7,8}};
        int[][]  arr2D2 = {{10,20,30},{40,50,60,70,80}};

        int[][]  arr2D3 = {{100,200,300},{400,500,600,700,800}};
        //            0             1

        int[][][]  arr3D = { arr2D1, arr2D2, arr2D3  };

        System.out.println(Arrays.deepToString(arr2D3));

        System.out.println(Arrays.deepToString(arr3D));

      //  System.out.println(arr3D[0][0][0]);
        /*for (int i=0;i<=arr2D1.length-1;i++){
            int [] eachArr=arr2D1[i];
            for (int j=0;j<=eachArr.length-1;j++){
                System.out.println(arr2D1[i][j]);
            }


        }*/

        for (int [] each:arr2D1 ) {
            for(int eacharr:each){
                System.out.println(eacharr);
            }

        }







    }
}
