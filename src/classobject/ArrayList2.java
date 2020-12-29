package classobject;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {

      /*  task03:
        1. create an Array of String called jobTitles
        2. write a program that only keeps the jobTitles that are: SDET and QA*/
        String[] jobTitles = {"SDET", "Scrum Master", "QA", "Developer", "PO", "BA", "CEO", "SDET", "QA", "Developer", "SDET"};

        ArrayList<String>jobs=new ArrayList<>(Arrays.asList(jobTitles));




        jobs.removeIf(p->!p.equals("SDET")&&!p.equals("QA")&&!p.equals("BA"));

        System.out.println(jobs);

Integer [] nums={10,20,30,40,60,70};
ArrayList<Integer>lsit=new ArrayList<>(Arrays.asList(nums));

lsit.removeIf(p->p>20&&p<40);
        System.out.println(lsit);





    }
}
