package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class fatihh {
    public static void main(String[] args) {

        ArrayList<offer> offers=new ArrayList<>();


        offers.addAll(Arrays.asList(new offer(),new offer(),new offer(),new offer(),new offer()));
         offers.get(0).setInfo("ny","dev","bofa",85000,true,true,true,true);
        offers.get(1).setInfo("va","sdet","capita",75000,true,false,false,false);
        offers.get(2).setInfo("ca","qa","bofa",95000,true,false,true,false);
        offers.get(3).setInfo("tx","sdet","bofa",65000,false,true,false,true);
        offers.get(4).setInfo("nj","qa","bofa",85000,true,true,true,false);




   /*     for (int i=0;i<=offers.size()-1;i++){
            offers.get(i).getInfo();
        }*/


        System.out.println("================================================================");

//only print the offers from va

   ArrayList<offer>localoffer=new ArrayList<>();
   localoffer.addAll(offers);

localoffer.removeIf(p->!p.location.equalsIgnoreCase("tx"));
        System.out.println(localoffer.size());

for (offer each:offers){
    if (each.location.equalsIgnoreCase("va")){
        each.getInfo();
    }
}

        System.out.println("===========================================");

ArrayList<offer>sdetoffer=new ArrayList<>(offers);

sdetoffer.removeIf(p->!p.jobTitle.equalsIgnoreCase("sdet"));

        System.out.println(sdetoffer.size());

        System.out.println("=====================================");


        ArrayList<offer>goodsalary=new ArrayList<>(offers);

        goodsalary.removeIf(p->p.salary<50000.00);
        System.out.println(goodsalary.size());
        System.out.println("====================================================");

      ArrayList<offer > fulltime=new ArrayList<>(offers);
      fulltime.removeIf(p->!p.isFulltime==true);
        System.out.println(fulltime.size());







    }


}
