class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int m = mat.length;      // rows
        int n = mat[0].length;   // columns

        // if only one row
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                ans.add(mat[0][i]);
            }
            return ans;
        }

        // if only one column
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                ans.add(mat[i][0]);
            }
            return ans;
        }

        // top row
        for (int i = 0; i < n; i++) {
            ans.add(mat[0][i]);
        }

        // right column
        for (int i = 1; i < m; i++) {
            ans.add(mat[i][n - 1]);
        }

        // bottom row
        for (int i = n - 2; i >= 0; i--) {
            ans.add(mat[m - 1][i]);
        }

        // left column
        for (int i = m - 2; i >= 1; i--) {
            ans.add(mat[i][0]);
        }

        return ans;
    }
}