package replit123;

public class profitorloss {
    public static void main(String[] args) {






    }
    public  String c_profits (int buyPrice,int sellPrice)
    {
        String a="loss";
        String b="profit";
        String c="no loss";
        //your code here
        if (buyPrice>sellPrice){
            return "loss";
        }else if (buyPrice<sellPrice){
            return b;
        }else{
            return c;
        }



    }


}
