package practice_10_20_20;

public class removeDuplicate2 {
    public static void main(String[] args) {

        String str = "abc abc ali bey bey ali bey";
        //String s="";
        String newcreated="";
for (int i=0;i<=str.length()-1;i++){
    String s=""+str.charAt(i);

    if (newcreated.contains(s)){
        continue;
    }else {
        newcreated+=s;
    }
}

        System.out.println(newcreated);







    }
}
