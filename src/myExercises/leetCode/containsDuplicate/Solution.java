package myExercises.leetCode.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int i,size=nums.length;
        for(i=0;i<size;i++){
            if(s.contains(nums[i])) return true;
            else s.add(nums[i]);
        }
        return false;
    }
}