class Solution {
    public int countOdds(int low, int high) {
        // int count=0;
        // for(int i=low;i<=high;i++){
        //     if(i %2 !=0){
        //         count++;
        //     }
        // }
        if(low == 1 && high == 1) return 1;
        if(low == high) return 0;
        return (high-low)/2+1;
    }
}