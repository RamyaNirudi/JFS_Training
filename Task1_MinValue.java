public class Task1_MinValue {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        System.out.println("Minimum value: " + min);
    }
}
