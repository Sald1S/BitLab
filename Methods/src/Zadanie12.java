import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        doub(str);
    }
    public static void doub(String str) {
        String temp = "";
        for (int i = 0; i < str.length();i++) {
            temp += str.charAt(i) + "" +str.charAt(i);
        }
        System.out.println(temp);
    }
}
