import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        uniq(array);
    }

    public static void uniq(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i] == array[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
