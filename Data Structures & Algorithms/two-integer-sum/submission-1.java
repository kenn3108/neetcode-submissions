class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        boolean breakVar = false;

        for (int i = 0; i < n; i++) {
            int minusNum = target - nums[i];
            for (int j = i + 1; j < n; j++) {
                int check = minusNum - nums[j];
                if (check == 0) {
                    result[0] = i;
                    result[1] = j;
                    breakVar = true;
                    break;
                }
            }
            if (breakVar) {
                break;
            }
        }

        return result;
    }
}
