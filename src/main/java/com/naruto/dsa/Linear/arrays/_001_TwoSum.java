package com.naruto.dsa.Linear.arrays;
import java.util.Arrays;

public class _001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    static void main(String[] args) {

        _001_TwoSum obj = new _001_TwoSum();
        int[] nums = {2,7,11,15};
        int target = 18;
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}


//Approach2:- HashMap
// Leetcode code so here main class not use.

//import java.util.HashMap;
//
//public class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//
//            map.put(nums[i], i);
//        }
//        return new int[]{};
//    }
//}