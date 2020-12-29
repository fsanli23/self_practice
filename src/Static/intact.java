package Static;

public class intact {
    public static boolean badP(int[] products,int limit)
    {
int counterOfintact=0;
int counterOfbroken=0;


for (int each:products){
    if (each==0){
        counterOfbroken++;
    }else{
        counterOfintact++;
    }
}
return  (counterOfbroken>=limit)? false:true;

    }
}
