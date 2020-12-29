package wrapperclass;

public class exercise17 {
    public static void main(String[] args) {

        int inches,zaza=0;
        double feet;
        for (inches=1;inches<=20;inches++){
            feet=inches/12.0;
            if (inches==1)
                System.out.println(inches+"inch equal to" +feet+"feet.");
            if (inches!=1)
                System.out.println(inches+"inches is equal to"+feet+"feet");
            zaza++;

            if (zaza==7){
                System.out.println();
                zaza=0;}


        }

    }
}
