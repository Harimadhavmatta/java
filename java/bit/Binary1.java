package bit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary1 {
    static int binary(int n) {
        int q = Integer.MAX_VALUE;
        int r;
        String bi = "";
        int count = 0;
        while (q != 0) {
            q = n / 2;
            r = n % 2;
            n = q;
            bi = r + bi;
            // System.out.println(r);
            if (r == 1) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(binary(1));
        List<List<Integer>> op = new ArrayList<List<Integer>>();

        int n = 3;
        int[] op = new int[n + 1];
        for (int j = 0; j <= n; j++) {
            System.out.println("number of 1's in " + j + " is " + binary(j));
            op[j] = binary(j);
        }
        System.out.println(Arrays.toString(op));
    }
}
