public class BuySellStocks {
    public static void main(String[] args) {
            int[] arr={7,1,5,3,6,4};
        System.out.println(trade(arr));
    }

    public static int trade(int[] prices){
        int min=Integer.MAX_VALUE; //index
        int max=-1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
