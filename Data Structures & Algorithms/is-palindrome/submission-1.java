class Solution {
    public boolean isPalindrome(String s) {

        String original =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=original.length()-1;i>=0;i--){
            sb.append(original.charAt(i));
        }
        return original.equals(sb.toString());
        
    }
}
