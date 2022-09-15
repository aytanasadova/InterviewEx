package myExercises.leetCode.productOfArray;

// 1ms, 50 mb o(n)
public class SolutionOptimal {

    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int i, powPost = 1, powPre = 1;

        answer[0] = powPre;

        for (i = 1; i < nums.length; i++) {
            powPre = nums[i - 1] * powPre;
            answer[i] = powPre;
        }

        answer[nums.length - 1] = answer[nums.length - 1] * powPost;

        for (i = nums.length - 2; i >= 0; i--) {
            powPost = nums[i + 1] * powPost;
            answer[i] = powPost * answer[i];
        }
        return answer;
    }
}
