import java.util.*;

public class Javastringreverse {
    public static boolean isPalindrome(String s) {
        int l = s.length();

        for (int i = 0 ; i < l/2 ; i++) {
            if (s.charAt(i) != s.charAt(l-1-i)) {
                return  false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        if (isPalindrome(A)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
                 
    }
}

