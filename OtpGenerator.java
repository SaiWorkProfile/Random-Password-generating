import java.util.*;
public class OtpGenerator {
    public char[] Otp(int len) {
        System.out.println("Generating one time password using random() :");
        System.out.print("Your otp is : ");
        String str = "1234567890";
        Random random = new Random();
        char[] ran = new char[len];
        for (int i = 0; i < len; i++) {
            ran[i]=str.charAt(random.nextInt(len));
        }
        return ran;
    }
}
