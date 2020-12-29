package a2_method;

public class frequencyOfChar {
    public static void main(String[] args) {

        String name="fatih sanli";
        frequency(name);





    }

    String result="";
    public static void frequency(String str){
        String result="";
        str=str.toLowerCase();
        for (int i=0;i<=str.length()-1;i++){
            int count=0;
            for (int j=0;j<=str.length()-1;j++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;

                }

}
                if (!result.contains(""+str.charAt(i))){
                    result+=str.charAt(i);
            }

        }

        System.out.println(result);



    }



}
