class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        for(int i=0;i<s.length()-1;i++){
            int curr = (int) Math.abs(s.charAt(i) - s.charAt(i+1));
            res+= curr;
        }
        return res;
    }
}