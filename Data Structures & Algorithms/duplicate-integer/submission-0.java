class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> check = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isExist = check.contains(nums[i]);
            if (isExist) {
                return true;
            }else {
                check.add(nums[i]);
            }
        }

        return false;
    }
}