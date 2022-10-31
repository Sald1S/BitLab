package OOP_Lambda;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        int avg = result/numbers.size();
        numbers.stream().filter(i -> i > avg).forEach(x -> System.out.print(x + " "));
    }
}