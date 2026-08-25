class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted=Arrays.toString(arr);
          if(!map.containsKey(sorted)){
            List<String> list= new ArrayList<>();
                      list.add(strs[i]);
                      map.put(sorted,list);
         }
         else{
         List<String> list=map.get(sorted);
         list.add(strs[i]);
         map.put(sorted,list);
         }
    }

    List<List<String>> result=new ArrayList<>();
     for (List<String> list : map.values()) {
    result.add(list);
}
return result;

}
}