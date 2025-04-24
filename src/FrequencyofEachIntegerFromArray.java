import java.util.HashMap;

public class FrequencyofEachIntegerFromArray {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 4, 5, 6};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println("The number" + key + "occurred " + value + "times ");

        });
    }
}
