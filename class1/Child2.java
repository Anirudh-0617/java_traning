class Parent2{
    static{
        System.out.println("this is P-S block ");
    }
    {
        System.out.println("this is P-I block ");
    }
}
public class Child2 extends Parent2{
    static{
        System.out.println("this is C-S block ");
    }
    {
        System.out.println("this is C-I block ");
    }
    Child2(){
        System.out.println("this is C constructor");
    }
    public static void main(String [] args){
        new Child2();
    }
}
