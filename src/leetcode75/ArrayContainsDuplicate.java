package leetcode75;

import java.util.HashSet;

public class ArrayContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 8, 7, 9, 10 };

        HashSet<Integer> set = new HashSet<>();
        boolean isDuplicate = false;

        for(int num : arr) {
            if(set.contains(num)) {
                isDuplicate = true;
                break;
            } else {
                set.add(num);
            }
        }
        if(isDuplicate) {
            System.out.println("Duplicate found");
        } else {
            System.out.println("All elements are distinct");
        }
    }
}
