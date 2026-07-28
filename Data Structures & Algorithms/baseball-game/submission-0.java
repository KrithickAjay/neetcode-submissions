class Solution {
    public int calPoints(String[] operations) {

        int sum=0;
        Stack<Integer> stack=new Stack<>();
        for(String s : operations){
            if(s.equals("+")){
                int a=stack.pop();
                int b=stack.peek() + a;
                stack.push(a);
                stack.push(b);
                sum+=b;
            }else if(s.equals("C")){
                sum -= stack.pop();
            }else if(s.equals("D")){
                int a=stack.pop();
                int b=2*a;
                stack.push(a);
                stack.push(b);
                sum+=b;
            }else{
                stack.push(Integer.parseInt(s));
                sum+=Integer.parseInt(s);
            }

        }
        return sum;
    }
}