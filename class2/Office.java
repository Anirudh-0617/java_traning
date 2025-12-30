class Employee{
    private String name,id;
    public Employee (String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
public class Office extends Employee{
    Office(String name, String id)
    {
        super(name,id);
    } 
    public static void main (String [] args){
        Office f1 = new Office ("Aniridh","6603");
        System.out.println(f1.getName());
        System.out.println(f1.getId());
        f1.setId("03");
        System.out.println(f1.getName() + " " + f1.getId());
    }
}