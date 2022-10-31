import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = in.nextInt();
            }
        }
        zamena(array);
    }

    public static void zamena(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            int temp = array[0][j];
            array[0][j] = array[array.length - 1][j];
            array[array.length - 1][j] = temp;
        }
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}



