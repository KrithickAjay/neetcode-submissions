class Solution {
    public String simplifyPath(String path) {
        String[] parts= path.split("/");
        Stack<String> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        
        for(String part : parts){
            if(part.equals("") || part.equals(".")){
                continue;
            }else if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(part);
            }
        
          
        }
        for(String dir : stack){
            sb.append("/");
            sb.append(dir);
        }
        
        return sb.length()==0 ? "/" : sb.toString();
    }
}