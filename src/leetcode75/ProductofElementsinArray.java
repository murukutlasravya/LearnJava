package leetcode75;

import java.util.Arrays;

public class ProductofElementsinArray {

    public static void main(String[] args) {

        int [] arr = {-1,1,0,-3,3};
        int [] result = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            int value = 1;
            for(int j=0; j<arr.length; j++) {

                if(j!=i){
                    value = value * arr[j];
                }

            }
            result[i]=value;
        }

        System.out.println(Arrays.toString(result));
    }
}
