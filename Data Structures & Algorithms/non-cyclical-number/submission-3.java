class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        int num=calSquare(n);
        while(num>0){
            if(num == 1) return true;
            if(set.contains(num)) return false;
            set.add(num);
            num = calSquare(num);
        }
        return true;
    }
    public int calSquare(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+= digit*digit;
            n/=10;
        }
        return sum;
    }
}
