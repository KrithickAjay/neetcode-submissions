class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String ,List<String>> map =new HashMap<>();
        for(String str : strs){

            char[] charStr=str.toCharArray();
            Arrays.sort(charStr);
            String sortStr=new String(charStr);
            if(map.containsKey(sortStr)){
                map.get(sortStr).add(str);
            }else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(sortStr,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
