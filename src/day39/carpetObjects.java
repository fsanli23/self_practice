package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {


        carpet[] carpets = {new carpet(), new carpet(), new carpet(), new carpet(), new carpet()};

        carpets[0].customOrder(5, 7, 15, false);

        carpets[1].customOrder(5, 7, 15, true);

        carpets[2].customOrder(8, 10, 12, false);

        carpets[3].customOrder(10, 15, 13, true);

        carpets[4].customOrder(15, 20, 20, true);

        System.out.println(carpets[0]);

        ArrayList<carpet> persianCarpets=new ArrayList<>(Arrays.asList(carpets));
        persianCarpets.removeIf(p->!p.isPersian);

        


    }

}
