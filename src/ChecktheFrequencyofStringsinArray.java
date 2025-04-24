import java.util.HashMap;

public class ChecktheFrequencyofStringsinArray {
    public static void main(String[] args) {

        String original = "this that that";

        String[] words = original.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println("String " + key + " occurred " + value + " times ");
        });
    }
}
