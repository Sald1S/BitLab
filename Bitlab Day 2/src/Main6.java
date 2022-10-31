import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String s1 = in.next();
        String s2 = in.next();
        String[] s = str.split("\\s");
        String temp = "";
        for(int i = 0; i < s.length; i++) {
            char x = s[i].charAt(s[i].length() - 1);
            if (x != '.') {
            } else {
                temp+=s[i].replace(s1+".", s2+".");
            }
            if (s[i].equalsIgnoreCase(s1)) {
                temp+=s2 + " ";
            } else{
            temp+=s[i] + x+ " ";
            }
        }
        System.out.println(temp);
    }
}

