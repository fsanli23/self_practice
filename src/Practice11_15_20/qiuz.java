package Practice11_15_20;

import java.util.Arrays;

public class qiuz {
    public static void main(String[] args) {

String s="the game was was tied at 2-2";

String s2=s.substring(5);

int i1=s.indexOf("game");
int i2=s2.indexOf("game");
if (i1==i2){
    System.out.println(i1);
}else{
    System.out.println(i2);
}


    }
}
