public class Task3_MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        System.out.println("Maximum value: " + max);
    }
}
