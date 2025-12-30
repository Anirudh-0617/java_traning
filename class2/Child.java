class Parent{
    void method(){
        System.out.println("this is Parent Class Method");
    }
}
public class Child extends Parent{
    @Override
    void method(){
        System.out.println("this is Child Class Method");
    }
    public static void main(String[] args){
        Child ob = new Child();
        ob.method();
    }
}