package leetcode75;

import java.util.HashMap;

import static java.lang.Math.abs;

public class SumofTwoElementsMeetsTarget {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++) {
            map.put(arr[i], i);
        }

        System.out.println("Here are the numbers: ");

        for(int a : arr)
        {
            if(map.containsKey(target-a)){
                System.out.println("Here are the values: " +a + "  " +(target-a));
            }
        }

    }
}
