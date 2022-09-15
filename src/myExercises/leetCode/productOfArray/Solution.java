package myExercises.leetCode.productOfArray;



// 6ms , 57.7 mb o(n)
class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int i, pow = 1;
        for (i = 0; i < nums.length; i++) {
            pow = nums[i] * pow;
            pre[i] = pow;
        }
        pow = 1;
        for (i = nums.length - 1; i > 0; i--) {
            pow = nums[i] * pow;
            post[i] = pow;
        }

        for (i = 0; i < nums.length; i++) {
            if (i == 0) answer[i] = post[i + 1];
            else if (i == nums.length - 1) answer[i] = pre[i - 1];
            else answer[i] = pre[i - 1] * post[i + 1];
        }
        return answer;
    }
}