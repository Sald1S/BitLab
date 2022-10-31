import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size;i++) {
            array[i] = in.nextInt();
        }
        sred(array);
    }
    public static void sred(int[] array) {
        for (int i = 0; i < array.length;i++) {
            if (array[i] < 50 && array[i]%5 ==0 ) {
                System.out.println(array[i]);
            }
        }
    }
}
