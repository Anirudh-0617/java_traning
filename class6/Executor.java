class Employee extends Thread{
    public Employee(String id){
        super(id);
    }
    @Override
    public void run(){
        System.out.println("hello"+" -> "+this.getName());
    }
}

class Manager extends Thread{
    public Manager(String id){
        super(id);
    }
    @Override
    public void run(){
        System.out.println("welcome"+" -> "+this.getName());
    }
}
public class Executor{
    public static void main(String[] args){
        Employee emp1 = new Employee("emp1");
        Manager mgr1 = new Manager("mgr1");

        emp1.start();
        mgr1.start();
        //these cant be used to start a thread because v cant revive a thread that is executed once
        //emp1.run();
        //mgr1.run();
    }
}