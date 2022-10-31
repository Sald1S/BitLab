package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zadanie24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }
        int m = in.nextInt();
        numbers.stream().filter(s -> s == m).forEach(a -> System.out.println("YES" + numbers.indexOf(a)));
    }
}


