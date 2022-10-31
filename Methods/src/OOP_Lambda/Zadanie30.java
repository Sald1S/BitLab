package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadanie30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }
        long sum = IntStream.range(0,numbers.size()-1)
                .filter(i -> numbers.get(i) < 0 && numbers.get(i+1) < 0 || numbers.get(i) > 0 && numbers.get(i+1) > 0)
                .count();

        if (sum>0) System.out.println("NO");
        else System.out.println("YES");
    }
}
