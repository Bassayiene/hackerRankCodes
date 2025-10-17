import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }
        scan.close();
        String[] tokens = s.trim().split("[ !,?._'@;]+");
        System.out.println(tokens.length);
        for (int i = 0; i<  tokens.length ; i++ ) {
            System.out.println(tokens[i]);
        }
    }
}

