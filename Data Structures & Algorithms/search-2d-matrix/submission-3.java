class Solution {
    public static boolean binarySearch(int[] a, int x) {
        int n = a.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (x < a[mid]) {
                right = mid - 1;
            }else if (x > a[mid]) {
                left = mid + 1;
            }else return true;
        }

        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lR = 0;
        int rR = m - 1;

        while (lR <= rR) {
            int midR = (lR + rR) / 2;
            if (matrix[midR][0] > target) {
                    rR = midR - 1;
            }else if (matrix[midR][0] < target) {
                if (matrix[midR][n - 1] >= target) {
                    boolean isFound = binarySearch(matrix[midR], target);
                    if (!isFound) {
                        return false;
                    }else {
                        return true;
                    }
                }else {
                    lR = midR + 1;
                }
            }else {
                return true;
            }
        }

        return false;
    }
}
