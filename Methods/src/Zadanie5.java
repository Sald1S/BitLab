import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        contain(s1,s2);
    }
    public static void contain(String s1, String s2) {
            if (s1.contains(s2)) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
    }
}
