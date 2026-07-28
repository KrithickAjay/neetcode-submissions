class Solution {
    public int missingNumber(int[] arr) {

        int n=arr.length;
        int expectedSum= n*(n+1)/2;
        int actualSum=0;

        for(int x:arr){
            actualSum+=x;
        }

        return expectedSum-actualSum;
        
    }
}
