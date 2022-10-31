import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < m;j++) {
                array[i][j] = in.nextInt();
            }
        }
        max(array);
    }
    public static void max(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println(max);
        }
    }
}

