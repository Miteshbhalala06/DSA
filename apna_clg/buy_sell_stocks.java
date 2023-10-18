public class buy_sell_stocks {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int max = buyAndSellStocks(prices);
        System.out.println(max);

    }

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;

        for (int i=0;i<prices.length;i++){
            if (buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
//                if (maxProfit < profit){
//                    maxProfit = profit;
//                }
                maxProfit = Math.max(maxProfit,profit);
            }else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
