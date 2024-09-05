package Sorting;

import java.util.Arrays;

public class Sort {
    static int[] insertion(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return arr;
        }
        int i = 1;
        while (i < arr.length) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            ++i;
        }
        return arr;

    }

    static int[] bubble(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            // int max=i;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int a1 = 0;
        int a2 = 0;
        int r = 0;

        if (arr1.length == 0) {
            return arr2;
        }
        if (arr2.length == 0) {
            return arr1;
        }

        int[] result = new int[arr1.length + arr2.length];

        while (a1 < arr1.length && a2 < arr2.length) {
            if (arr1[a1] < arr2[a2]) {
                result[r++] = arr1[a1++];
            } else {
                result[r++] = arr2[a2++];
            }
        }

        // Copy remaining elements from arr1, if any
        while (a1 < arr1.length) {
            result[r++] = arr1[a1++];
        }

        // Copy remaining elements from arr2, if any
        while (a2 < arr2.length) {
            result[r++] = arr2[a2++];
        }

        return result;
    }

    static int[] selection(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) { // ascending order
                    // if (arr[min] < arr[j]) { // desending order
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int lis[] = { 10, 2, 1, 11, 44, 22, 33 };
        // int lis[]={1, 2, 10, 11, 22, 33, 44}
        // int lis[] = { 12 };
        int[] a1 = { 10, 20, 22, 30, 40, 45, 50 };
        int[] a2 = { 15, 25, 35, 45, 46, 55, 65, 75 };
        System.out.println(Arrays.toString(insertion(lis)));
        System.out.println("hello");
        System.out.println(Arrays.toString(selection(lis)));
        System.out.println("hello");
        System.out.println(Arrays.toString(bubble(lis)));
        System.out.println("hello");
        System.out.println(Arrays.toString(combine(a1, a2)));
        System.out.println("hello");
    }
}