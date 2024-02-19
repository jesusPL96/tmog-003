package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    //Inappropriate solution
    //Random, low scale only, not 100% successful
    public static Integer maxSubArrayV1(Integer[] nums) {
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < 500; i++) {
            int randomPlace = (int)(Math.random() * nums.length);
            int randomQuantity = (int)(Math.random() * (nums.length - randomPlace)) + 1;
            int auxValue = 0;


            for(int j = randomPlace; j < randomPlace + randomQuantity && j < nums.length; j++) {
                auxValue += nums[j];
            }

            if(auxValue > maxValue) {
                maxValue = auxValue;
            }
        }

        return maxValue;
    }

    //Correct and refactored solution using Kadane
    public static Integer maxSubArrayV2(Integer[] nums){

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }


}
