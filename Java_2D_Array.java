import java.util.*;

public class Java_2D_Array {
    
     public static void main(String[] args) {
	   
         List<List<Integer>> array2D = new ArrayList<>();
         List<Integer> array1D_1 = new ArrayList<>();
         List<Integer> array1D_2 = new ArrayList<>();
         List<Integer> array1D_3 = new ArrayList<>();
         Integer[] tab = {40,41,12};
         List<Integer> array1D_4 = new ArrayList<>(Arrays.asList(tab));


         array1D_1.add(10); array1D_1.add(11); array1D_1.add(12);
         array1D_2.add(20); array1D_2.add(21); array1D_2.add(22);
         array1D_3.add(30); array1D_3.add(31); array1D_3.add(32);

         

         array2D.add(array1D_1); array2D.add(array1D_2); array2D.add(array1D_3); array2D.add(array1D_4);

         System.out.print(array2D);

    }
}
