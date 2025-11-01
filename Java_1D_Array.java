import java.util.*;
public class Java_1D_Array {
     public static void main(String[] args) {
	   
         int[] a;
         try (Scanner scan = new Scanner(System.in)) {
             int n = scan.nextInt();
             a = new int[n];
             for (int i = 0; i < a.length; i++) {
                 a[i] = scan.nextInt();
             }}

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}