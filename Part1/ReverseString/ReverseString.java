//reverse

//package Part1.ReverseString;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the word \n");
        String s = sc.nextLine();
        System.out.print("The original word:" + s);
        System.out.println("\nOutput reversed word");
        int n = s.length();
        char[] reverse = s.toCharArray();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }

    }
}
