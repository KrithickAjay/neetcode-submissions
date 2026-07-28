class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int n=s2.length();
        int k=s1.length();
        for(int e=0;e<=n-k;e++){
            int[] freq2=new int[26];
           for(int s=e;s<e+k;s++){
            freq2[s2.charAt(s) - 'a']++;
           }

            if(Arrays.equals(freq,freq2)){
                return true;
            }
        }
        return false;

    }
}
