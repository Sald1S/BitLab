package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            numbers.add(in.nextInt());
        }
        long x = numbers.stream().filter(i -> i > 0).count();
        System.out.println(x);
    }
}
