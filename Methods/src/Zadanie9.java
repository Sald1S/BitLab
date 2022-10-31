import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
                array[i] = in.nextInt();
        }
        nechet(array);
    }
    public static void nechet(int[] array) {
        for (int i = 0;i < array.length; i++) {
            if (array[i] == 23) {
                break;
            }
            if (array[i]%2==1) {
                System.out.println(array[i] + " ");
            }
        }
    }
}
