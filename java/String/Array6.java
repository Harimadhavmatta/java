// ############ Error #############

public class Array6 {
    public static int index(int[] nums, int num) {
        int p1 = 0;
        int p2 = nums.length - 1;
        int len = nums.length;
        boolean pass = false;
        int index = 0;
        if (nums[p1] > num) {
            index = 0;
            pass = true;
        }
        if (nums[p2] < num) {
            index = nums.length;
            pass = true;
        }
        while (p2 > p1 && pass == false) {
            if (nums[p1] == num) {
                index = 0;
            } else if (nums[p2] == num) {
                index = nums.length;
            } else if (num > nums[p1]) {
                ++p1;
            } else if (num < nums[p1]) {
                --p1;
            } else if (num > nums[p2]) {
                --p1;
            } else if (num < nums[p1]) {
                ++p1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 6, 7, 8, 10 };
        int num = 5;

    }
}
