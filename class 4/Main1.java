interface IArthiematic{
    int calculate(int a, int b);
}

class Add implements IArthiematic{
    public int calculate(int a, int b){
        return a + b;
    }
}

class Sub implements IArthiematic{
    public int calculate(int a, int b){
        return a - b;
    }
}

class Mul implements IArthiematic{
    public int calculate(int a, int b){
        return a * b;
    }
}

class Div implements IArthiematic{
    public int calculate(int a, int b){
        return a / b;
    }
}

class Mod implements IArthiematic{
    public int calculate(int a, int b){
        return a % b;
    }
}

class Main1{
    public static void main(String[] args){
        System.out.println(new Add().calculate(20, 10));
        System.out.println(new Sub().calculate(20, 10));
        System.out.println(new Mul().calculate(20, 10));
        System.out.println(new Div().calculate(20, 10));
        System.out.println(new Mod().calculate(20, 10));
    }
}
