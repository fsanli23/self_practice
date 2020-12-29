package a2_method;

public class calculater {
    public static void main(String[] args) {

        System.out.println(calculator(2, '*', 9));
    }

    public static double calculator(int num1, char operator, int num2) {
        boolean isvalid = operator == '+' || operator == '-' || operator == '/' || operator == '*';
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
        }
        return result;
    }


}
