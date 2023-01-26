public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = 100000;

        for (int price : prices) {
            if (price < min) min = price;
            else if (price - min > profit) {
                profit = price - min;
                //System.out.println(prices[i] + " " + min + " " + profit);
            }
        }
       return profit;
    }
}
