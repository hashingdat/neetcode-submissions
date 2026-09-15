class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int max_count=1;
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
     for (int i=0;i<nums.length-1;i++){
        if(nums[i]+1==nums[i+1]){
            count ++;
            max_count=Math.max(count,max_count);
         }
         else if (nums[i]==nums[i+1]){
            max_count=Math.max(count,max_count);
            continue;
         }
         else {
            count=1;
         }
     } 
     return max_count;  
    }
}
