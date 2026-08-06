class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack =new Stack<Integer>();
    

        for (String score: operations){
            

        if(score.equals("+")){
            if(!stack.isEmpty()){
            int a =stack.pop();
            int b=stack.peek();
            int c=a+b;
            stack.push(a);
            stack.push(c);
            }
 }
        else if(score.equals("D")){
            int a=stack.peek();
            int b=a*2;
            stack.push(b);
            
        }
        else if(score.equals("C")){
            if(!stack.isEmpty()){
                stack.pop();
            }
            
        }
        else{
        int run =Integer.parseInt(score);
        stack.push(run);
        }
        
    }
    int sum=0;
        while(!stack.isEmpty()){
        sum=sum+stack.peek();
        stack.pop();
 }
 return sum;
    }
}