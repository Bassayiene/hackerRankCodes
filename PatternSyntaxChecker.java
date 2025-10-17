import java.util.Scanner;
import java.util.regex.*;


public class PatternSyntaxChecker {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        String[] patterns = new String[testCases];
        int n = testCases;
		while(n>0){
			String pattern = in.nextLine();
            patterns[n-1] = pattern;
            n--;
          	//Write your code
		}
        in.close();

        for (int i = testCases; i> 0 ; i--) 
        {
            try {
                Pattern.compile(patterns[i-1]);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
	}
}
