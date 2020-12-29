package practice11_06_20;

public class oddeven {
    public static void main(String[] args) {
        /*1. how many even numbers in the array?
                2. how many odd numbers in the array?
                3. how many numbers can be evenly divisible by 3?
                4. how many numbers can be evenly divisible by 5?*/

        int[] numbers = new int[100];
        int odd = 0;
        int even=0;
        int dev3=0;
        int dev5=0;
        for (int i = 0; i <= numbers.length-1; i++) {
            numbers[i] = i;
            if (numbers[i]%2==0){
                even++;
            }else{
                odd++;
            }
if (numbers[i]%3==0){
    dev3++;
}
if (numbers[i]%5==0){
    dev5++;
}
        }

        System.out.println("odd"+odd);
        System.out.println("even"+even);
        System.out.println(dev3);
        System.out.println(dev5);



    }
}
