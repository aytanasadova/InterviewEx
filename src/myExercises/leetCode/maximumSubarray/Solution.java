package myExercises.leetCode.maximumSubarray;

class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSum=nums[0],currentSum=0;

        for(int e:nums){
            if (currentSum<0) currentSum=0;
            currentSum= currentSum+e;
            if (currentSum>maxSum) maxSum=currentSum;
        }
        return maxSum;
    }


    public static void main(String[] args) {
        System.out.println(maxSubArray( new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}