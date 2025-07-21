import java.util.Arrays;

public class Task8_CountDistinctStreams {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        long count = Arrays.stream(arr).distinct().count();
        System.out.println("Number of distinct values using streams: " + count);
    }
}
