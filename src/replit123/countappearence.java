package replit123;

public class countappearence {
    public static void main(String[] args) {



String f="fatih";
        String name[]={"fatih","sanli","serap","fatih","fatih",};
count_appearance(name,f);



    }

    public  static int count_appearance(String[] arr, String t) {
        int count=0;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i].equalsIgnoreCase(t)){
                count++;
            }

        }
        return count;
    } //end  count_appearance

}
