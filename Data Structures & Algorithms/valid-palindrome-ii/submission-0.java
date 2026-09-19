class Solution {
    public boolean validPalindrome(String s) {

        for(int i =0;i<s.length();i++){

            StringBuilder sb = new StringBuilder();

            for(int j =0;j<s.length();j++){
                if(i != j){
                    sb.append(s.charAt(j));
                }
            }

            if(isPalindrome(sb.toString())){
                return true;
            }
        }

        return false;

    }


    public boolean isPalindrome(String s){


        int left = 0;
        int right = s.length() -1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}