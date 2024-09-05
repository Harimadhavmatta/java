import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 5, 4, 2, 3 };
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];

        }
        System.out.println(Arrays.toString(arr));
    }
}
