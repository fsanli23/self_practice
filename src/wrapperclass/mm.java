package wrapperclass;

class First {
    public static int CBSE (int x) {
        if (x < 100) x = CBSE (x + 10);
        return (x - 1);
    }
    public static void main (String[] args){
       // System.out.print(wrapperclass.First.CBSE(60));


        float f=45;
        System.out.println(f);
    }
}