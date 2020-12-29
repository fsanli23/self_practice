package replitpractice11_14_20;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Scanner;

public class AvarageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for (int i=0;i<=temps.length-1;i++){
            total+=temps[i];
        }
avgTemp=total/temps.length;

        System.out.println(avgTemp);


    }
}
