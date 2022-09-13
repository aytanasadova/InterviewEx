package myExercises.leetCode.twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] ar=new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target)
                {
                    ar[0]=i;
                    ar[1]=j;
                    return ar;
                }
            }
        }

        return ar;
    }
    public int[] twoSum1(int[] nums, int target) {
        int[] ar=new int[2];
        Map<Integer,Integer> m=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target)
                {
                    ar[0]=i;
                    ar[1]=j;
                    return ar;
                }
            }
        }

        return ar;
    }
}