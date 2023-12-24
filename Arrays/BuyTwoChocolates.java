package Arrays;

import java.util.Arrays;

//problem: 2706
public class BuyTwoChocolates {
    public static void main(String[] args) {
            int[] a={3,2,3};
        System.out.println(buyChoco(a,3));
    }

    public static int buyChoco(int[] prices, int money) {
        int minAmount=Integer.MAX_VALUE;

        Arrays.sort(prices);   //takes O(n.log n)
        minAmount=prices[0]+prices[1];
        if(minAmount<=money){
            return money-minAmount;
        }
        return money;

    }
}
