import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Insert Name :");
        String name = in.next();

        System.out.printf("Insert surname: ");
        String surname = in.next();

        System.out.printf("Insert your age: ");
        int age = in.nextInt();

        System.out.println(name + " " + surname + " " + age);
    }
}