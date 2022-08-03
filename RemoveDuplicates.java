import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void RemoveDuplicateFromArray(int [] arr) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) 
           set.add(arr[i]); 
        
        int[] filteredArray = new int[set.size()];

        int x = 0;
        for (Integer s : set) 
            filteredArray[x++] = s;
         
        for (int index = 0; index < filteredArray.length; index++) {
            System.out.println(filteredArray[index]);
        }

    }

    public static void main(String[] args) {
        int[] arry = new int []{1, 2, 3, 4, 4, 5};
        RemoveDuplicateFromArray(arry);
    }
}
