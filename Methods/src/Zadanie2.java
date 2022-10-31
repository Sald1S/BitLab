import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        triangle(a,b,c);
    }
    public static void triangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
