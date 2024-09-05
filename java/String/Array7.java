// ######### Error ##########

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        String s = "1,2,3,4,5,6";
        String[] strlis = s.split(",");
        int[] arr = { 2, -1, 9, 100 }; // 1,2,3,4,5
        int nag = 0;
        int res;
        boolean zero = false;
        for (int i = 0; i < strlis.length; i++) {
            int k=int(strlis[i]);
            if (arr[i] == 0) {
                zero = true;
            }
            if (arr[i] < 0) {
                ++nag;
            }
        }
        // System.out.println(nag);
        if (nag % 2 == 0) {
            res = 0;
        } else {
            res = 1;
        }
        if (zero) {
            res = 0;
        }
        System.out.println(res);
        System.out.println(Arrays.toString(strlis));
        
    }
}
