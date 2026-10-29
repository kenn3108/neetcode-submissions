class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int r = n - 1;
        int maxWater = Integer.MIN_VALUE;

        while (l < r) {
            int water = (r - l) * Math.min(heights[l], heights[r]);
            maxWater = Math.max(water, maxWater);
            if (heights[l] <= heights[r]) {
                l++;
            }else {
                r--;
            }
        }

        return maxWater;
    }
}
