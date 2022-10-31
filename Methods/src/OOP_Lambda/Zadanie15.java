package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }

        int result = numbers.stream().filter(i -> i > 0).reduce(1,(a,b) -> a*b);
        System.out.println(result);
    }
}
