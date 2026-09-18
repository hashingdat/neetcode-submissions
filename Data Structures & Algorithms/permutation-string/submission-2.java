class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int window=s1.length()-1;
        int left=0;
        int right=window;
        

        for(int i=0;i<s2.length()-window;i++){
            String s2sort=s2.substring(left,right+1);
            char []arr1=s2sort.toCharArray();
            Arrays.sort(arr1);

            char []arr2=s1.toCharArray();
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                return true ;
            }

            else {
                left++;
                right++;
            }


            

        }
        return false;
        
    }
}
