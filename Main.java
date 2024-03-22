//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PasswordGenerator pg=new PasswordGenerator();
        OtpGenerator otp=new OtpGenerator();
        System.out.println(otp.Otp(5));
        System.out.println(pg.Password(8));
        }
    }