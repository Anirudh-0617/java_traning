public class Main7{
    public static void main(String[] args) {
        try{
           int[] a = {1,2,3,4};
           System.out.println(a[5]);
        }
        catch(Exception ArrayIndexOutOfTheBoundsException){
            System.out.println("cant access elements out of range");
        }
    }
}