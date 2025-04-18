import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int number = scanner.nextInt();
        System.out.println("After adding 10 to the inputed number:" + (number+10));
    }

}
