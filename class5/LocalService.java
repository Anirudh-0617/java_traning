public class LocalService {
    public static void main(String[] args) {
        LocalService service = new LocalService();
        service.login("123654");
        service.login("123456");
    }
    private void login(String enterOtp){
        final String generatedOtp = "123456";
        class OtpValidator{
            boolean isValid(){
                return enterOtp.equals(generatedOtp);
            }
        }
        OtpValidator validator = new OtpValidator();
        if(validator.isValid()){
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid OTP");
        }
    }
}
