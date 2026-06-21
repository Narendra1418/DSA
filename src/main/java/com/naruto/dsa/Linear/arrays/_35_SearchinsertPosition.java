package com.naruto.dsa.Linear.arrays;

public class _35_SearchinsertPosition {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return left;
        }
        public static void main(String[] args) {
        _35_SearchinsertPosition obj = new _35_SearchinsertPosition();
            int result = obj.searchInsert(
                    new int[]{1,2,3,4,5,6,7,8,9,10},
                    7
            );

            System.out.println(result);
        }
    }

