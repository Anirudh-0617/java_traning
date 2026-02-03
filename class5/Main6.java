public class Main6{
    public static void main(String[] args) {
        try{
            int a=3;
            int b=0;
            System.out.println(a/b);
        }
        catch(Exception ArthmeticException){
            System.out.println("number / 0 not accpected");
        }
    }
}