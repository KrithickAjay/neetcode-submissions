class Solution {
    public boolean hasDuplicate(int[] arr) {
        int count =0;
        for(int e = 0 ;e<arr.length-1;e++){
            for(int s=e+1;s<arr.length;s++){
                if(arr[e]==arr[s]){
                    return true;
                }
            
            }


        }
        return false;
    }
}