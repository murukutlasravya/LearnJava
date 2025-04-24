package leetcode75;

import java.util.Arrays;

public class SumofTwoElementsinArray {

    public static int[] twoSum(int[] nums, int target) {

        int twoSum = 0;
        int result [] = new int[0];
        for(int i=0; i<nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                twoSum = nums[i] + nums[j];
                if (twoSum == target) {
                    result = new int[]{i, j};
                    return result;
                }

            }
        }
        return result;

    }

    public static void main(String[] args){
        int [] nums = {1,2,3,4,5,6};
        int target = 9;
        int [] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
