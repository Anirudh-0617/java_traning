class Student {
    String uid;
    String stdName;
    String [] coursesRegistered;
    int regcoursecount=0;

    public Student(String uid, String stdName) {
        this.uid = uid;
        this.stdName = stdName;
        coursesRegistered = new String [10];  //no of courses the student can register to { size allocated }
        regcoursecount = 0; 
    }
boolean enrollCourse(String course){
    for(int i = 0; i < regcoursecount; i++){
        if(coursesRegistered[i].equals(course))
            return false;
    }
    if (regcoursecount<coursesRegistered.length){
        coursesRegistered[regcoursecount] = course;
        regcoursecount++;
        return true;
    }
    return false;
}    
}
class CoureManagment{
    static String [] allcourses = new String[10];
    static int totalcourses = 0;
    static boolean enrollStudentincourse(Student stu, String course){
        boolean inNewCourse = true;
        for(int i = 0; i < totalcourses; i++){
            if(allcourses[i].equalsIgnoreCase(course)){
                inNewCourse = false;
                break;
            }
        }
        if(inNewCourse && allcourses.length>totalcourses){
            allcourses[totalcourses] = course;
            totalcourses++;
        }
        return stu.enrollCourse(course);
    }
}
public class Main{
    public static void main(String [] args){

        Student s1 = new Student("6603", "Anirudh");
        Student s2 = new Student("6622", "Prash");
        Student s3 = new Student("6621", "Srikar");
        

        System.out.println(CoureManagment.enrollStudentincourse(s1, "M-1"));
        System.out.println(CoureManagment.enrollStudentincourse(s1, "C Language"));
        System.out.println(CoureManagment.enrollStudentincourse(s2, "M-1"));
        System.out.println(CoureManagment.enrollStudentincourse(s2, "C Language"));
        System.out.println(CoureManagment.enrollStudentincourse(s3, "Python"));
        System.out.println("the total courses offered are " + CoureManagment.totalcourses);
    
    }
}