package a3_pverloading;

import java.util.Arrays;

public class

























































sort {
    public static void main(String[] args) {
        String name="fatih sanli does live in dallas";
        String [] arr=name.split(" ");
        char[] arr1=name.toCharArray();
        //Arrays.sort(arr);
       // Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));

        addbyte((byte)1,(byte)2);


        String a="123";
        int  b=Integer.parseInt(a);
        System.out.println(b);
        System.out.println(b+1);

String [] h={"fatih","sanli","dallas","inanc"};
        for (int i=0;i<=3;i++) {
            switch (h[i]) {
                case "fatih":
                    System.out.println("fatih");
                case "inanc":
                    System.out.println("inanc");
                case "dallas":
                    System.out.println("dallas");
            }
        }




    }



    public static void addbyte(byte a ,byte b){
        System.out.println(a+b);
    }
}
