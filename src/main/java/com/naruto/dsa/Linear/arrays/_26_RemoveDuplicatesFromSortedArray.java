package com.naruto.dsa.Linear.arrays;

public class _26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        _26_RemoveDuplicatesFromSortedArray r =
                new _26_RemoveDuplicatesFromSortedArray();

        int[] nums = {2, 7, 7, 10, 18, 33, 33, 45};

        int k = r.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}