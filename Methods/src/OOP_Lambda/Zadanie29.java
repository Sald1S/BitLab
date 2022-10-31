package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadanie29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }
        long sum = IntStream.range(numbers.indexOf(0)+1, numbers.lastIndexOf(0)).map(i -> numbers.get(i)).reduce(1,(a,b)->a*b);
        System.out.println(sum);
    }
}
