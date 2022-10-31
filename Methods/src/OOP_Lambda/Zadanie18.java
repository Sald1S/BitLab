package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        //int k = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            numbers.add(in.nextInt());
        }
//        int k = in.nextInt();
//        numbers.stream().filter(i -> i%k==0).forEach(x -> System.out.print(x));
        int n = numbers.stream().max(Integer::compareTo).get();
        System.out.println(n);
    }
}
