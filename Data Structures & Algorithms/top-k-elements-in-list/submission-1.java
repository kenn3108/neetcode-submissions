class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            boolean isExist = map.containsKey(nums[i]);
            if (isExist) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
        }

        
        Integer[] topValuesArray = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .map(Map.Entry::getKey) 
                .toArray(Integer[]::new);

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = topValuesArray[i];
        }

        return result;
    }
}
