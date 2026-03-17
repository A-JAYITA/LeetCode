class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, maxSize = 0;

        // Step 1: Precompute heights in-place
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) matrix[i][j] += matrix[i - 1][j];
            }
        }

        // Step 2: Sort each row and calculate area
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i].clone();
            Arrays.sort(row); 
            for (int j = 0; j < m; j++) {
                maxSize = Math.max(maxSize, row[j] * (m - j));
            }
        }
        return maxSize;
    }
}