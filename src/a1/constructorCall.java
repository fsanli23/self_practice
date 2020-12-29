package a1;

public class constructorCall {


    public constructorCall(){
        System.out.println("const1");
    }
    public constructorCall(int a){
        System.out.println("const2");
    }
   public constructorCall(int a,int b){
       System.out.println("const 3");
   }
   public constructorCall(int a,int b,int c){
        this(a,b);
       System.out.println("const4");
   }




    public static void main(String[] args) {

constructorCall obj= new constructorCall(1,2,3);



    }









}
