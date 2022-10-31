import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        vremaGoda(n);
    }
    public static void vremaGoda(int n) {
        if (n == 1 || n == 2 || n == 12) {
            System.out.println("Winter");
        }
        if (n == 3 || n == 4 || n == 5) {
            System.out.println("Spring");
        }
        if (n == 6 || n == 7 || n == 8) {
            System.out.println("Summer");
        }
        if (n == 9 || n == 10 || n == 11) {
            System.out.println("Autumn");
        }
    }
}
