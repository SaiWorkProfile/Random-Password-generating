import java.util.*;
public class PasswordGenerator {
    public static char[] Password(int len ){
        System.out.println("Generating password using random() :");
        System.out.print("Your new password is : ");
        String capitalcharacter="ASDFGHJKLQWERTYUIOPZXCVBNM";
        String smallchararacter="qwertyuiopasdfghjklzxcvbnm";
        String number="1234567890";
        String sybols="!@#$%^&*()_+~{}|:<>?";
        String values=capitalcharacter+smallchararacter+sybols+number;
        char[] password=new char[len];
        Random random=new Random();
        for(int i=0;i<len;i++){
            password[i]=values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
}
