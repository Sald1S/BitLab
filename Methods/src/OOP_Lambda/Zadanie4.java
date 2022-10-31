package OOP_Lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            numbers.add(in.nextInt());
        }
        numbers.stream().filter(i -> numbers.indexOf(i)%2!=0).forEach(x-> System.out.println(x));
    }
}
