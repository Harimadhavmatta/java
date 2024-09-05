import java.util.Arrays;

public class Array4 {
    public static int[] insert(int[] arr, int i, int num) {
        int[] val = new int[arr.length + 1];
        int a = 0;
        for (int j = 0; j < val.length; j++) {
            if (i != j) {
                val[j] = arr[a]; // [1,2,3,4,5,6,7] i=3
                ++a;
            } // []
            else {
                val[j] = num;

            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 6, 7 };
        nums = insert(nums, 3, 20);
        System.out.println(Arrays.toString(nums));
        System.out.println("===============");
    }
}
