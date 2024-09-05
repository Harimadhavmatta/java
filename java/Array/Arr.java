package Array;

import java.util.*;

class Solution {
    static int find(int[] arr, int x) {
        for (int d = 0; d < arr.length; d++) {
            if (arr[d] == -x) {
                return d;
            }
        }
        return -1;
    }

    static List<List<Integer>> threeSum(int[] nums) {
        int l=0;
        int h=nums.length;
        int[] op=new int[3];
        
        while(l<h){
            int lis=0;
            op[lis]=nums[l];
            ++lis;
            
            int sum=op[lis];
            for(int j=l;j<nums.length;j++){
                op[lis]=nums[j];
                sum=sum+nums[j];
                int index=find(nums,sum);
                if(index>-1){
                    op[lis]=nums[index];
                }
                
            }
        }
        public static void main(String[] args){

        }
    }
}