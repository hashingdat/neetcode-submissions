class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<Integer>();

        for(String token : tokens){
            if(token.equals("+")){
                int a =stack.pop();
                int b= stack.pop();
                int c=a+b;
                stack.push(c);
}
            else if(token.equals("-")){
                if(!stack.isEmpty()){
                int a =stack.pop();
                int b=stack.pop();
                int c=b-a;
                stack.push(c);

                }   
            }
            else if(token.equals("*")){
                 if(!stack.isEmpty()){
                int a =stack.pop();
                int b=stack.pop();
                int c=b*a;
                stack.push(c);

                } 
                
            }
            else if(token.equals("/")){
                if(!stack.isEmpty()){
                int a =stack.pop();
                int b=stack.pop();
                int c=b/a;
                stack.push(c);

                } 
                
            }
            else{
                int a =Integer.parseInt(token);
                stack.push(a);
            }
        }
        return stack.peek();

        
    }
}
