//import java.util.Arrays;
import java.util.Scanner;

public class JavaAngram2 {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        String s_a = a.toLowerCase(); 
        String s_b = b.toLowerCase(); 

        int[] freq = new int[256];

        for (int i=0; i<a.length(); i++ ) {
            freq[s_a.charAt(i)]++;
            freq[s_b.charAt(i)]--;
        }

        for(int count : freq) {
            if (count !=0) return false;
        }
        return true;
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