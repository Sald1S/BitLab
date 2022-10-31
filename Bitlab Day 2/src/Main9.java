import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

    Scanner in = new Scanner (System.in);
    String str = in.nextLine();
    String[] words = str.split(" ");
    String ans = "";
    for (int i = 0; i < words.length; i++) {
        ans +=words[i].substring(0,1).toUpperCase() + words[i].substring(1) + " ";
    }System.out.println(ans);
}
}

