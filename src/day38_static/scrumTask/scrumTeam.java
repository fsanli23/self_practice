package day38_static.scrumTask;

import java.util.ArrayList;

public class scrumTeam {
    public String PO, BA, SM;
     ArrayList<tester> testerteam = new ArrayList<>();
     ArrayList<developer> developerteam = new ArrayList<>();


    public static boolean hasSprint = true;
    public static boolean hasMeeting = true;

    public void setInfo(String PO,String BA,String SM){
        this.BA=BA;
        this.PO=PO;
        this.SM=SM;
    }

public  void hireTester(tester t1){
       testerteam.add(t1);
}
public void firetester(String id){
        testerteam.removeIf(p->p.id.equalsIgnoreCase(id));
}



}
