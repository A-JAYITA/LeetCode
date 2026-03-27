class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        k = k % n;
        for(int i = 0; i < m ; i++) {
            for(int j = 0 ;j < n ; j++) {
                if(mat[i][(j-k+n)%n] != mat[i][j]) return false;
            }
        }
        return true;
    }
}