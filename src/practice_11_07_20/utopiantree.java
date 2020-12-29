package practice_11_07_20;

public class utopiantree {
    public static void main(String[] args) {

     /* for (int i=1,g=0;i<=10;i++){
          if (i<4){
              g++;
              System.out.println("year "+i+"-growth "+"1 cm\n" +
                      "tree size:"+g+"cm");
          }else{
              g+=2;
              System.out.println("year "+i+"-growth "+"2 cm\n" +
                      "tree size:"+g+"cm");
          }
      }*/

        int year = 1;


        int growth = 0;
        int size =0;

        for( year=1; year <=10; year++){
            if(year<=3){
                growth = 1;
            }else{
                growth = 2;
            }
            size += growth;
            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + size + " cm");
        }







    }
}
