
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ArrayList<Integer>[] lists = new ArrayList[n];

            for (int i = 0; i < n; i++) {
                lists[i] = new ArrayList<>();
                int d = sc.nextInt();
                for (int j = 0; j < d; j++) {
                    int element = sc.nextInt();
                    lists[i].add(element);
                }

            }
            int m = sc.nextInt();

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if ((x - 1 >= 0) && (x - 1 < lists.length) && (y - 1 >= 0) && (y - 1 < lists[x - 1].size())) {
                    System.out.println(lists[x - 1].get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            }

        }
    }
}
