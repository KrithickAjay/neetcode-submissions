class Solution {
    public boolean isPalindrome(String s) {

        String original =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(original).reverse();
        return original.equals(sb.toString());
        
    }
}
