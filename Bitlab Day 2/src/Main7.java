import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");
        String temp = "";
        for (int i = 0; i < words.length; i++) {
            if ("one".equalsIgnoreCase(words[i])) {
                temp = temp + 1 + " ";
            }
            else if ("two".equalsIgnoreCase(words[i])) {
                temp = temp + 2 + " ";
            }
             else if ("three".equalsIgnoreCase(words[i])) {
                temp = temp + 3 + " ";
            }
            else if ("four".equalsIgnoreCase(words[i])) {
                temp = temp + 4 + " ";
            }
            else if ("five".equalsIgnoreCase(words[i])) {
                temp = temp + 5 + " ";
            }
            else if ("six".equalsIgnoreCase(words[i])) {
                temp = temp + 6 + " ";
            }
            else if ("seven".equalsIgnoreCase(words[i])) {
                temp = temp + 7 + " ";
            }
            else if ("eight".equalsIgnoreCase(words[i])) {
                temp = temp + 8 + " ";
            }
            else if ("nine".equalsIgnoreCase(words[i])) {
                temp = temp + 9 + " ";
            }
            else if ("zero".equalsIgnoreCase(words[i])) {
                temp = temp + 0 + " ";
            }
            else {
                temp+=words[i] + " ";
            }
        }
        System.out.println(temp);
    }

    }
