class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map =new HashMap<>();
        for(String str : strs){
            
            String freqString = calculateFreqString(str);
            if(map.containsKey(freqString)){
                map.get(freqString).add(str);
            }else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(freqString,list);
            }
        }
            return new ArrayList<>(map.values());
    }
    public String calculateFreqString(String str){
        int[] freq=new int[26];
        StringBuilder sb=new StringBuilder();
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        char ch = 'a';
        for(int i : freq){
            sb.append(i).append(ch++);
        }
        return sb.toString();
    }

}
