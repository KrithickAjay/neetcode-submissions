class Solution {
    public String longestPalindrome(String s) {
        // if(s.length() == 1) return s;
        
        String res = "";
        int resLen = 0;

        for(int i=1;i<s.length();i++){
            int left = i-1;
            int right= i+1;
            while(left >= 0 && right < s.length()
             && s.charAt(left) == s.charAt(right)){
                int len = right-left+1;
                if(len > resLen ){
                    res = s.substring(left,right+1);
                    resLen = len;

                }
                    left--;
                    right++;
                 
             }

             int prev = i-1;
             int next =i;
             while(prev >= 0 && next< s.length()
             && s.charAt(prev) == s.charAt(next)){
                int len1 = next-prev+1;

                if(len1 > resLen) {
                    resLen = len1;
                    res=s.substring(prev,next+1);
                }
                prev--;
                next++;
                
             }
        }
        if(res.equals("")) return String.valueOf(s.charAt(0));
        return res;
    }
}
