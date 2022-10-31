import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String a = in.next();
        count(str,a);
    }
    public static void count(String str , String a) {
        int count = 0;
        for (int i = 0; i < str.length();i++) {
            if (a.equalsIgnoreCase(Character.toString(str.charAt(i)))) {
                count++;
            }
        } System.out.print(count);
    }
}
