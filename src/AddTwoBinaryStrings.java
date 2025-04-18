public class AddTwoBinaryStrings {

    public static void main(String[] args) {

        String binaryOne = "011011";
        String binaryTwo = "1010111";

        int result = sumofBinaryStrings(binaryOne, binaryTwo);

        System.out.println(Integer.toBinaryString(result));
    }

    public  static int sumofBinaryStrings(String A, String B) {

        int a = Integer.parseInt(A,2);
        int b = Integer.parseInt(B,2);

        return a+b;
    }
}
