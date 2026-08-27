class Solution {
    public int characterReplacement(String s, int k) {

        int left =0;
        int max = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        for(int right =0;right < s.length();right++){

            char ch = s.charAt(right);
            freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            int length = right - left + 1;

            while(length - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
                length = right-left +1;
            }

            max = Math.max(length,max);
        }
        return max;
    }
}






















// class Solution {
//     public int characterReplacement(String s, int k) {
//         int left=0;
//         int max=0;
//         int maxFreq=0;
//         int[] freq=new int[26];

//         for(int right=0;right<s.length();right++){
//             char ch=s.charAt(right);
//             freq[ch-'A']++;
//             maxFreq=Math.max(maxFreq,freq[ch-'A']);
//             int length=right-left+1;
//             while(length-maxFreq>k){
//                 freq[s.charAt(left)-'A']--;
//                 left++;
//                 length=right-left+1;
//             }
//             max=Math.max(length,max);
//         }
//         return max;
//     }
// }
// class Solution {
//     public int characterReplacement(String s, int k) {
//        int max=0;
//        for(int i=0;i<s.length();i++){
//         int maxFreq=0;
//        HashMap<Character,Integer> map=new HashMap<>();

//         for(int j=i;j<s.length();j++){
//         char ch =s.charAt(j);
//         map.put(ch,map.getOrDefault(ch,0)+1);
//         maxFreq = Math.max(maxFreq,map.get(ch));
//         int length=j-i+1;
//         if(length-maxFreq <= k){
//             max=Math.max(max,length);
//         }
//        }}
//        return max;
//     }
// }
