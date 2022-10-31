import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ost(num);
    }
    public static void ost(int num) {
        if (num%2==0) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
