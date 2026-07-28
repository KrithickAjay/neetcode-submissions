class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }
        int k=s1.length();
        int n=s2.length();
        int[] freq1=new int[26];
        for(int i=0;i<k;i++){
            freq1[s1.charAt(i) - 'a']++;
        }
        int[] freq2=new int[26];
        for(int i=0;i<n;i++){

            freq2[s2.charAt(i) - 'a']++;
            if(i >= k){
                freq2[s2.charAt(i-k) - 'a']--;
            }
            if(Arrays.equals(freq1 ,freq2)){
                return true;
            }
        }
        return false;
        
    }
}
