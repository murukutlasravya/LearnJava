import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxofThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("Enter the third number");
        int c = sc.nextInt();

        //Aproach: 1
        //Using Math.max
        int max = Math.max(Math.max(a,b),c);
        System.out.println("Maximum number is "+max);


        //Approcah:2
        //using if-satements
        int maxVal;
        if(a>b && a>c){
            maxVal=a;
        } else if(b>a && b>c){
            maxVal=b;
        } else
            maxVal=c;
        System.out.println("Maximum number is "+maxVal);


        //Approach:3
        //Using Collections.max()

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println("Max value from Collections: " + Collections.max(list));

    }

}
