public class SwapTwoNumbersWithoutThird {

    public static void main(String[] args) {

        int m = 7;
        int n = 9;

        System.out.println("Value of Num1 before swapping:" +m);
        System.out.println("Value of Num2 before swapping:" +n);

        m = m + n ;
        n = m - n;
        m = m - n ;

        System.out.println("Value of Num1 after swapping:" +m);
        System.out.println("Value of Num2 after swapping:" +n);

    }
}
