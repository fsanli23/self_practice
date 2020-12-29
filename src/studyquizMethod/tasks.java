package studyquizMethod;

import java.util.Arrays;

public class tasks {
    public static void main(String[] args) {
        float m = 34;
        float n = 56;
        int o = (int)sum(m, n);
        System.out.println("o = " + o);

    }



    public static void sum(int a, int b,int c)
    {
        System.out.println("a = " + a + " b = " + b);

    }
    public static float sum(float m, float n)
    {
        System.out.println("m = " + m + " n = " + n);
        return m + n;
    }
}