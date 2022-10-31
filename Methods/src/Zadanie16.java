import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        maxMin(array);
    }
    public static void maxMin(int[] array) {
        int max = 0;
        int min = array[0];
        for (int i = 0; i < array.length;i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min + "\n" + max);
    }
}
