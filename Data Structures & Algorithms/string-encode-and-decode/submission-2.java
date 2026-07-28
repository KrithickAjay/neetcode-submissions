class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        int i=0;
        List<String> result = new ArrayList<>();
        while(i<s.length()){
            int j=i;

            while(s.charAt(j) != '#'){
                j++;
            }

            int len=Integer.parseInt(s.substring(i,j));
            i=j+1;

            result.add(s.substring(i,i+len));
            i=i+len;
        }
        return result;
    }
}
