class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l = 0;
        int count = 0;
        int n = s.length();

        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);
            while (charSet.contains(c)) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            count = Math.max(count, r - l + 1);
        }

        return count;
    }
}
