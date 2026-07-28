class Solution {
    public int maxProfit(int[] arr) {
        
        int minPrice=arr[0];
        int maxProfit=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<minPrice){
                minPrice=arr[i];
            }

            int profit = arr[i]-minPrice;


            if(maxProfit<profit){
                maxProfit=profit;
            }          

        }
        return maxProfit;
    }
}
