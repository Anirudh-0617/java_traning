interface IArithmetic {
    int calculate(int a, int b);
}

public class LambdaArithmeticExample {
    public static void main(String[] args) {

        IArithmetic add = (int a, int b) -> a + b;


        IArithmetic subtract = (int a, int b) -> a - b;


        IArithmetic multiply = new IArithmetic() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };


        IArithmetic divide = new IArithmetic() {
            @Override
            public int calculate(int a, int b) {
                return (b != 0) ? a / b : 0;
            }
        };


        int num1 = 20;
        int num2 = 5;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(add.calculate(num1, num2));
        System.out.println(subtract.calculate(num1, num2));
        System.out.println(multiply.calculate(num1, num2));
        System.out.println(divide.calculate(num1, num2));
    }
}