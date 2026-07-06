class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list= new ArrayList<>();
        boolean [] visited=new boolean[strs.length];


        for(int i =0;i<strs.length;i++){

            if(visited[i]){
                continue;
            }
                char []arr =strs[i].toCharArray();
                Arrays.sort(arr);
                  List<String> first = new ArrayList<>();
                  first.add(strs[i]);
                  visited[i]=true;

                for(int j=i+1;j<strs.length;j++)
                {
                    if(visited[j]){
                        continue;
                    }
                    char []check=strs[j].toCharArray();
                    Arrays.sort(check);

                    if(Arrays.equals(arr,check)){
                        first.add(strs[j]);
                        visited[j]=true;
  }
                 
                }
                list.add(first);
                }
               
                   return list; 
        } 
            
           
    }

