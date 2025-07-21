import java.util.Arrays;

public class Task2_MinValueStrings {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        String s = Arrays.toString(arr).replaceAll("[\\[\\]\\s]", "");
        String[] parts = s.split(",");
        int min = Integer.parseInt(parts[0]);

        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (num < min) min = num;
        }
        System.out.println("Minimum using strings: " + min);
    }
}
