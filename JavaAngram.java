import java.util.Arrays;
import java.util.Scanner;

public class JavaAngram {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        String s_a = a.toLowerCase(); 
        String s_b = b.toLowerCase(); 

        char[] t_a = s_a.toCharArray();
        char[] t_b = s_b.toCharArray();

        Arrays.sort(t_a);
        Arrays.sort(t_b);

        return Arrays.equals(t_a, t_b);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}