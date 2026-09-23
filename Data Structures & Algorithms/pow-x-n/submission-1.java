class Solution {
    public double myPow(double x, int n) {

        double res = 1;
        long num = n;

        if(num < 0){
            res = 1/res;
            num = -num;
        }

        while(num >0){
            if(num %2 == 1){
                res = res *x;
            }

            x = x*x;
            num/=2;
        }
        return n <0 ? 1/res : res;
    }
}
