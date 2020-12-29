package replit123;

public class simpleroom {
    public static void main(String[] args) {

        System.out.println(simpleRoomBook(true,7,8,2018));

    }
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {
if ((isAvailable==false)||(month==7)||(day>=1&&day<=8)){
    return false;
    }else {
    return true;
    }

    }
}
