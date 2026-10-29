class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int n = numbers.length;
        int l = 0, r = n - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r--;
            }else if (sum < target) {
                l++;
            }else {
                result[0] = ++l;
                result[1] = ++r;
                break;
            }
        }

        return result;
    }
}
