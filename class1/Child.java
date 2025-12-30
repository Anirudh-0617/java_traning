class Parent{
    Parent(){
        System.out.println("this is P1 constructor ");
    }
}
public class Child extends Parent{
    Child(){ 
        super();
        System.out.println("this is C1 constructor");
    }
    public static void main(String [] args){
        new Child();

    }
}