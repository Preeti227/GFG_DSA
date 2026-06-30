class Solution {
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int j = 0; j < n; j++) {
            int start = 0;
            int end = n - 1;

            while (start < end) {
                int temp = matrix[start][j];
                matrix[start][j] = matrix[end][j];
                matrix[end][j] = temp;

                start++;
                end--;
            }
        }
    }
}