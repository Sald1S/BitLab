import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login = in.next();
        String password = in.next();
        logPass(login,password);
    }
    public static void logPass(String login, String password) {
        if (login.equals("admin") && password.equals("qwerty")) {
            System.out.println("Authentication completed");
        } else {
            System.out.println("Invalid login or password");
        }
    }
}
