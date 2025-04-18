import java.util.Scanner;

public class LcmOfTwoNumbers {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int result = getLcmOfTwoNumbers(a,b);
        System.out.println("LCM of the above two numbers is:" +result);
    }
    
    public static int getLcmOfTwoNumbers(int a, int b) {
        int max = Math.max(a,b);
        while (max % a != 0 || max % b != 0) {
            max++;
        }
        return max;
    }
}


//LCM (i.e. Least Common Multiple) is the largest of the two stated numbers that can be divided by both the given numbers.