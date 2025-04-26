package leetcode75;

public class MaximumSubArray {

    public static void main(String[] args) {

        int[] arr = {1, -3, -1, 4, 1, 2};
        int maximumSum = arr[0], currentSum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            System.out.println("Current Sum: " + currentSum);

            maximumSum = Math.max(maximumSum, currentSum);
            System.out.println("Maximum: " + maximumSum);
        }

        System.out.println("Maximum value: " + maximumSum);
    }
}