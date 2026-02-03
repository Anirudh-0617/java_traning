//note: what happens if v create a obj for parent class and refference for a child class
package class6;

class Parent{
    void Features(){
        System.out.println("this is CR");
    }
    void m1(){

    }
    void m2(){

    }
}

class Child extends Parent{
    @Override
    void Features(){
        System.out.println("this is CRUD");
    }
    void m3(){

    }
}
public class Main{
    public static void main(String[] args){
        Parent p = new Child();
        p.Features();
        p.m1();
        p.m2();
    }
}