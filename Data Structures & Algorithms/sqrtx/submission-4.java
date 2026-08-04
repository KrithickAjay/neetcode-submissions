class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int low=1;
        int high=x;
        int root=1;
        while(low <= high){
            int mid=low+ (high-low)/2;
            long sq= (long) mid*mid;
            if(sq > x) high=mid-1;
            else{
                root=mid;
                low=mid+1;
            }
        }
        return root;
    }
}