import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        glas(str);
    }
    public static void glas(String str) {
        String glas = "aeioyu";
        int count = 0;
        for (int i = 0; i < str.length();i++) {
            if (glas.contains(Character.toString(str.charAt(i)))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
