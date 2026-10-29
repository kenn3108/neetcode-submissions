class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.toString(sArr).equals(Arrays.toString(tArr));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int n = strs.length;

        for (int i = 0; i < n; i++) {
            if (result.isEmpty()) {
                List<String> item = new ArrayList<>();
                item.add(strs[i]);
                result.add(item);
            }else {
                boolean isAdd = false;
                for (var item : result) {
                    var firstEl = item.get(0);
                    boolean isAnagram = isAnagram(firstEl, strs[i]);
                    if (isAnagram) {
                        item.add(strs[i]);
                        isAdd = true;
                    }
                }
                if (!isAdd) {
                    List<String> item = new ArrayList<>();
                    item.add(strs[i]);
                    result.add(item);
                }
            }
        }
        return result;

    }
}
