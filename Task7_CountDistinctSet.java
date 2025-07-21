import java.util.*;

public class Task7_CountDistinctSet {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        Set<Integer> distinct = new HashSet<>();
        for (int val : arr) {
            distinct.add(val);
        }
        System.out.println("Number of distinct values: " + distinct.size());
    }
}
