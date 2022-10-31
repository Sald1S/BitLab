import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length;i++) {
            array[i] = in.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++){
        if (max < array[0])
            max = array[i] ;
    }
        System.out.println(max);
}
    }
