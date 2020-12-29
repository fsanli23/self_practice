package a3_pverloading;

public class FindSumOfBinaryStrings {
    public static void main(String[] args) {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90)
                System.out.print("Printing");
            if (b == (byte) 0x90)
                System.out.print("Printing");
            if ((b & 0xff) == 0x90)
                System.out.print("Printing");
        }


            /*Byte bt = new Byte((byte) 'A');
            byte b = bt.byteValue();
            String str = "Primitive byte value of Byte object: " + bt + " " + "is" + " " + b;
            System.out.print(str);
*/

        Byte bt = new Byte("-126");
        byte b = bt.byteValue();
        String str = "Primitive byte value of Byte object: " + bt + " " + "is" + " " + b;
        System.out.print(str);





    }

    private  void sayhi() {
        System.out.println("hi");
    }

    public  void hayname() {
        System.out.println("fatih");
    }
}
