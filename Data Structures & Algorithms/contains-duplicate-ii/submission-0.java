class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                if(arr[i]==arr[j] && (Math.abs(i-j))<=k){
                    return true;
                }}
            }
        }
        return false;
    }
}