package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadanie26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }
        IntStream.range(0, numbers.size()).forEach(i -> System.out.print(numbers.get(numbers.size()-1-i) + " "));
    }
}
