public class Array5 {
    public static boolean isSorted(int[] arr) {
        boolean res = true;
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i - 1] < arr[i])) {
                // System.out.println(i);
                res = false;
            }

        }
        return res;
    }

    public static int[] delete(int[] arr, int i) {
        int[] op1 = new int[arr.length - 1];
        int op1_el = 0;
        for (int f = 0; f < arr.length; f++) {
            if (f != i) {
                op1[op1_el] = arr[f];
                ++op1_el;
            }
        }
        return op1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2 };
        boolean op;
        int count = 0;
        // boolean op = isSorted(arr);
        for (int k = 0; k < arr.length; k++) {

            op = isSorted(delete(arr, k));
            // System.out.println(op);
            if (op) {
                ++count;
            }
        }
        System.out.println(count);

    }
}
