class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int y=0;
        int []output=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
             int k=1;
           for(int j=0;j<nums.length;j++){
            if(i==j){


            }
            else{
               k=k*nums[j];
            }
            
           }
           output[y]=k;
           y++;

            
                        


        }
        
      return output;  
    }
}  
