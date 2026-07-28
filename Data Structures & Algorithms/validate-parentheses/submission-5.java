class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();
        char[] arr=s.toCharArray();

        for(char ch:arr){
            
            if(ch == '(' || ch== '{' | ch == '['){
                stack.push(ch);
            }
            else if((ch == ')' && stack.isEmpty()) | (ch == '}' && stack.isEmpty()) 
            | (ch == ']' && stack.isEmpty())){
                return false;
            }
            else if(stack.isEmpty()){
                return true;
            }
            else if(ch == ')' && stack.pop() != '('){
                return false;
            }
            else if(ch == '}' && stack.pop() != '{'){
                return false;
            }
            else if(ch == ']' && stack.pop() != '['){
                return false;
            }
        }

        return stack.isEmpty();
        
    }
}
