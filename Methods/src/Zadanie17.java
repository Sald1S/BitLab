import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char operator = in.next().charAt(0);
        calc(a,b,operator);
    }
    public static void calc(int a, int b, char operator) {
        if (operator == '+') {
            System.out.println(a + b);
        }
        if (operator == '-') {
            System.out.println(a - b);
        }
        if (operator == '/') {
            System.out.println((double) a / b);
        }
        if (operator == '*') {
            System.out.println(a * b);
        }
    }
}
