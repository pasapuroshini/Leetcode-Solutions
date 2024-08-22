class P121 {
    public int maxProfit(int[] prices) {
        // Initialize the minimum price to a large value
        int mini = Integer.MAX_VALUE;
        // Initialize the maximum profit to 0
        int maxProfit = 0;
        
        // Traverse each price in the array
        for (int i = 0; i < prices.length; i++) {
            // If the current price is less than the minimum price seen so far, update mini
            if (prices[i] < mini) {
                mini = prices[i];
            }
            
            // Calculate the potential profit by selling at the current price
            int profit = prices[i] - mini;
            
            // If this profit is greater than the maximum profit seen so far, update maxProfit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        
        // Return the maximum profit
        return maxProfit;
    }
}
