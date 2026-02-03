class Parent{
    void Features(){
        System.out.println("this is CR");
    }
    void m1(){

    }
    void m2(){

    }
}
public class Main1 {
    public static void main(String[] args) {
        Parent p = new Parent() {
            void Features() {
                System.out.println("CRUD");
            }
            void m3(){

            }
        };
        p.Features();
    }   
}
