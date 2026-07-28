class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();
        char[] arr=s.toCharArray();

        for(char ch:arr){


            if(ch == '('){
                stack.push(')');
            }
            else if(ch == '{'){
                stack.push('}');
            }
            else if(ch == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!= ch){
                return false;
            }

            
            // if(ch == '(' || ch== '{' || ch == '['){
            //     stack.push(ch);
            // }
            // else if((ch == ')' && stack.isEmpty()) ||
            // (ch == '}' && stack.isEmpty()) ||
            // (ch == ']' && stack.isEmpty())){
            //     return false;
            // }
           
            // else if((ch == ')' && stack.pop() != '(') ||
            // (ch == '}' && stack.pop() != '{') ||
            // (ch == ']' && stack.pop() != '[')) {
            //     return false;
            // }
            
            
        }

        return stack.isEmpty();
        
    }
}
