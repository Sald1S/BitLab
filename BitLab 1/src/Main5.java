import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = (int) Math.sqrt(a * b);
        System.out.println(sum);
    }
}
