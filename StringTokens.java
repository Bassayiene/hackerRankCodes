import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        String s;
        try (Scanner scan = new Scanner(System.in)) {
            s = scan.nextLine();
            // Write your code here.
            if (s.trim().isEmpty()) {
                System.out.println(0);
                return;
            }
        }
        String[] tokens = s.trim().split("[ !,?._'@;]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

