class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=0;
        int minPrice=prices[0];
        for(int price : prices){
            maxPrice=Math.max(maxPrice,price-minPrice);
            minPrice=Math.min(minPrice,price);
        }
        return maxPrice;
    }
}
