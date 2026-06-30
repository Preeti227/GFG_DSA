class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int j = 0; j < mat[0].length; j++){

            ArrayList<Integer> row = new ArrayList<>();

            for(int i = 0; i < mat.length; i++){
                row.add(mat[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}