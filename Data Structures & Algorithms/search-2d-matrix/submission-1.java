class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length;
        int n=arr[0].length;
        int left=0;
        int right=m*n-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            int value=arr[mid/n][mid%n];
            if(target ==  value){
                return true;
            }else if(value < target){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}
