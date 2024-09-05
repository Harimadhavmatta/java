import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 2, 2 };
        int[] arr = new int[2 * nums.length];
        int n = 0;
        for (int i = 0; i < 2 * nums.length; i++) {
            if (i < nums.length) {
                arr[i] = nums[i];
            } else {
                arr[i] = nums[n];
                ++n;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
