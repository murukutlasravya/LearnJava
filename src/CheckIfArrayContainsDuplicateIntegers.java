import java.util.HashSet;

public class CheckIfArrayContainsDuplicateIntegers {

    public static void main(String[] args) {

        int nums [] = {1,2,3,4,1};

        HashSet<Integer> numsSet = new HashSet<>();

        for(int num : nums) {
            if(numsSet.contains(num)) {
                System.out.println("Duplicates Present");
                break;
            } else {
                numsSet.add(num);
            }
        }
    }
}
