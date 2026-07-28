class Solution {
    public String largestGoodInteger(String s) {

        String ans="";

        for(int i=0;i<s.length()-2;i++){
            char ch = s.charAt(i);
            if(s.charAt(i+1) == ch && s.charAt(i+2) == ch){
                String curr=s.substring(i,i+3);

                if(ans.equals("") || curr.compareTo(ans) >0){
                    ans=curr;
                }
            }
            
        }
        return ans;
        
    }
}