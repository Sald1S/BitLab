package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }
        numbers.stream().mapToInt(i -> i).average().ifPresent(avg -> System.out.println(avg));
    }
}
