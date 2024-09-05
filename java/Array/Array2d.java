package Array;

import java.util.*;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(i + " ++++ " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }

    }
}
