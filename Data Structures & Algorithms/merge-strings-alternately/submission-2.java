class Solution {
    public String mergeAlternately(String word1, String word2) {


        StringBuffer sb=new StringBuffer();
        int temp=0;
        int greater=0;
        if(word1.length()>=word2.length())
        greater=word1.length();
        else
        greater=word2.length();
        for(int i=0;i<greater;i++){
            if(i<word1.length())
            sb.append(word1.charAt(i));
            if(i<word2.length())
            sb.append(word2.charAt(i));
            temp=i;

        }
        return sb.toString();
        
        
    }
}