package com.naruto.dsa.Linear.arrays;

public class _27_RemoveElements {


    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        _27_RemoveElements obj = new _27_RemoveElements();

        int[] nums = {3, 2, 2, 3,7,7};
        int val = 7;

        int k = obj.removeElement(nums, val);

        System.out.println("k = " + k);

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
