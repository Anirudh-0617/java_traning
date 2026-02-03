interface IComparable{
    int compare(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args){

        IComparable greater = (int a, int b) -> {
            return (a > b) ? a : b;
        };


        IComparable smaller = new IComparable() {
            @Override
            public int compare(int a, int b) {
                return (a < b) ? a : b;
            }
        };


        int num1 = 15;
        int num2 = 25;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Greater: " + greater.compare(num1, num2));
        System.out.println("Smaller: " + smaller.compare(num1, num2));
    }
}