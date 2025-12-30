class Parent1{
    Parent1(int a){
        System.out.println("this is P1 constructor ");
    }
}
public class  Child1 extends Parent1{
    Child1(int num){ //explicit call to parent constructor
        super(num);
        System.out.println("this is C1 constructor");
    }
    public static void main(String [] args){
        new Child1(10);

    }
}