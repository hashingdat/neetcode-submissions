class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        int count=1;
        if(nums.length==0){
            return 0;
        }
        
    
        
        for(int i=0;i<nums.length-1;i++){

// duplicate
               if(nums[i]==nums[i+1]){
                continue;
               }

// sequence
            
            if(nums[i]==nums[i+1]-1){
                count++;
                max =Math.max(count,max);

//  sequence broken restart   
            }
            else{
                count=1;
            }
        }
        return max;
        }

        
    }
