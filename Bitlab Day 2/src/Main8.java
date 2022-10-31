import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");
        String ans = "";
        int temp = 0;
        boolean flag = false;
        for (int i = 1; i < words.length - 1;i++) {
            if (words[i].equals("/")) {
                if (flag) {
                    temp = temp / Integer.parseInt((words[i + 1]));
                } else {
                    temp = Integer.parseInt((words[i - 1])) / Integer.parseInt((words[i + 1]));
                    flag = true;
                }
            }
            if (words[i].equals("*")) {
                if (flag) {
                    temp = temp * Integer.parseInt((words[i - 1]));
                } else {
                    temp = Integer.parseInt((words[i - 1])) * Integer.parseInt((words[i + 1]));
                    flag = true;
                }
            }
            if (words[i].equals("+") || words[i].equals("-")) {
                if (flag);
            }
        }
        System.out.println(temp);
    }
}
