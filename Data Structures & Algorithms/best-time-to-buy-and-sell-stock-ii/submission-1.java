class Solution {
    public int maxProfit(int[] arr) {
        
        int max = 0;

        for(int i = 0;i<arr.length-1;i++){
            int curr = 0;

            if(arr[i] < arr[i+1]){
                max += arr[i+1]-arr[i];
            }
        }

        return max;
    }
}