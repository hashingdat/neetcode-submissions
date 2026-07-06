
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Step 2: Store answer
        int[] ans = new int[k];

        // Step 3: Find the maximum frequency k times
        for (int i = 0; i < k; i++) {

            int maxKey = 0;
            int maxFreq = Integer.MIN_VALUE;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            ans[i] = maxKey;
            map.remove(maxKey);
        }

        return ans;
    }
}


