package leetcode75;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArraysBuyandSellStock {

    public static int maxProfit(int[] prices) {

        int maxPrice = 0;
        int minPrice = 0;

        minPrice = prices[0];
        int indexOfMinPrice = 0;
        int indexOfMaxPrice = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }

        System.out.println(minPrice);
        maxPrice = prices[indexOfMinPrice];
        for(int i=indexOfMinPrice+1; i<prices.length; i++){
            if(maxPrice<prices[i]){
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }

System.out.println(maxPrice);
        System.out.println("To attain Max profi buy on DAY = " + indexOfMinPrice + " and sell on DAY = " + indexOfMaxPrice);

        return maxPrice;



    }

    public static void main(String[] args) {

        int[] prices = {7, 4, 5, 3, 6, 1};
        System.out.println(maxProfit(prices));
    }
}
