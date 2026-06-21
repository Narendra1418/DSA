package com.naruto.dsa.Linear.arrays;

import java.util.Arrays;

public class _66_PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // Case when all digits are 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        _66_PlusOne obj = new _66_PlusOne();

        int[] digits = {7, 8, 9};

        int[] result = obj.plusOne(digits);

        System.out.println(Arrays.toString(result));
    }
}