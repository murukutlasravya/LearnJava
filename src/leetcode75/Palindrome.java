package leetcode75;

public class Palindrome {

    public static boolean isPalindrome(int x)
    {
        if (x<0){
            return false;
        }

            String value = String.valueOf(x);

        int left = 0;
        int right = value.length()-1;

        while(left<right){
            if(value.charAt(left)!=value.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        int i = 1211;

      System.out.println(isPalindrome(i));

    }

}
