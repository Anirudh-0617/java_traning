class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class TestCustom {
    public static void main(String[] args) {
        try {
            vaildate(18);
        } catch (InvalidAgeException ob) {
            System.out.println(ob.getMessage());
        }
    }

    private static void vaildate(int age) throws InvalidAgeException {
       if(age<18){
            throw new InvalidAgeException("Age not sufficiant");
       }
       else{
           System.out.println("Age valid");
       }
    }
}