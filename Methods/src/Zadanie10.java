import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(sred(array));
    }
    public static int sred(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%5 > 0) {
                sum+=array[i];
            }
        }
        return sum;
    }
}
