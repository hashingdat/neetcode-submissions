class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] freq = new int[26];
        int window = 0;
        int max_freq = 0;
        int longest_substring = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;

            max_freq = Math.max(freq[s.charAt(right) - 'A'], max_freq);

            window = right - left + 1;

            if (window - max_freq > k) {
                freq[s.charAt(left) - 'A']--;
                window--;
                left++;
            }
            window = right - left + 1;
            longest_substring = Math.max(window, longest_substring);
        }
        return longest_substring;
    }
}
