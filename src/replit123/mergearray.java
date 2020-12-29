package replit123;

import java.util.Arrays;

public class mergearray {
    public static void main(String[] args) {
        int [] c={1,2,3,4,5,6,};
        int [] d={1,2,3,4,5,6,};

        System.out.println(Arrays.toString(mergR(c,d)));
    }




    public static int[] mergR(int[] a,int[] b) {

int [] merged=new int[a.length+b.length];

int count=0;
for (int i=0;i<=a.length-1;i++){
    merged[i]=a[i];
    count++;

    }
for (int i= 0;i<=b.length-1;i++){
    merged[count++]=b[i];
}
return merged;

    }//end mergR





}
