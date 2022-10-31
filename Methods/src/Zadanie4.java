import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        polindrom(str);
    }
    public static void polindrom(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--){
            str1+=str.charAt(i);
        }
        if (str.equalsIgnoreCase(str1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}