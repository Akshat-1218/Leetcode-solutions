class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int maxRow = 0;
            for (int i = 1; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }
            int leftValue = (mid > 0) ? mat[maxRow][mid - 1] : -1;
            int rightValue = (mid < n - 1) ? mat[maxRow][mid + 1] : -1;
            if (mat[maxRow][mid] > leftValue &&
                mat[maxRow][mid] > rightValue) {

                return new int[]{maxRow, mid};
            }
            if (rightValue > mat[maxRow][mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}