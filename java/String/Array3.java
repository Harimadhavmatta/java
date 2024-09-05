public class Array3 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int p1 = 0;
        int p2 = nums.length - 1;
        int count = 0;
        while (p1 != nums.length - 1) {
            if (nums[p1] == nums[p2]) {
                ++count;
                --p2;
            } else {
                --p2;
            }
            if (p2 - p1 == 0) {
                ++p1;
                p2 = nums.length - 1;
            }
        }
        System.out.println(count);
    }
}
