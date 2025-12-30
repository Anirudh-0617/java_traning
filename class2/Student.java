public class Student {
    private String name,id;
    public Student(String name, String id){
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
    public String toString(){
        return this.name+" "+this.id;
    }
    public static void main(String[] args){
        Student s1 = new Student("Alpha", "i1");
        Student s2 = new Student("Beta", "i2");
        System.out.println(s1);
    }
}