package leetcode75;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {

    public static void main(String args[]) {

        String roman = "XIII"; // 13

        System.out.println(roman);

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int length = roman.length();
        int i = 0;
        int value = 0;

        while (i < length) {
            // Get value of current character
            int currentVal = map.get(roman.charAt(i));

            // Get value of next character (if exists)
            int nextVal = 0;
            if (i + 1 < length) {
                nextVal = map.get(roman.charAt(i + 1));
            }

            // Compare current and next
            if (currentVal < nextVal) {
                value += (nextVal - currentVal);
                i += 2; // skip next character
            } else {
                value += currentVal;
                i++;
            }
        }

        System.out.println("Final Value = " + value);
    }
}
