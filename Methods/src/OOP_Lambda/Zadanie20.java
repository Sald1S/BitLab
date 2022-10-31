package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        //int k = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }
        int max = numbers.stream().max(Integer::compareTo).get();
        System.out.print(max + " ");
        numbers.stream().filter(i -> numbers.indexOf(max) == numbers.indexOf(i)).forEach(a -> System.out.print(numbers.indexOf(a)));
        System.out.println(numbers.indexOf(max));
    }
}
