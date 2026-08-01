class Solution {
    public boolean canJump(int[] arr) {
        
        int finalPos=arr.length-1;

        for(int index = arr.length-2;index>=0;index--){

            if(index + arr[index] >= finalPos){
                finalPos=index;
            }
        }
        return finalPos == 0;
    }
}
