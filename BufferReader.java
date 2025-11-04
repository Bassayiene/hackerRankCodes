import java.io.*;
import java.util.Scanner;
public class BufferReader {
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void main(String[] args) throws IOException {
        try (BufferedReader br2 = new BufferedReader(new FileReader("text.txt"))) {
            String line;
            while((line = br2.readLine()) != null) {
                System.out.println(line);
            }
        }

        // ce bloc de code lit caractere par caractere à partir du disque dur donc déconseillé (plusieurs lecture disque)
        int c1;
        try (FileReader fr = new FileReader("text.txt")) {
            while((c1 = fr.read()) != -1) {
                System.out.print((char) c1);
            }
            System.out.println("");
        }

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String[] row = br1.readLine().split(" ");
            for (String s : row ) {
                System.out.println(s);
            }
        
        // utilisation de la classe Scanner 
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            System.out.println(input);
        }
            return;
    }
}
