class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int[] minRow = new int[m], maxCol = new int[n];
        Arrays.fill(minRow, Integer.MAX_VALUE);
        for(int i = 0; i < m ; i++){
            for(int j =0; j < n; j++){
                minRow[i] = Math.min(matrix[i][j], minRow[i]);
            }
        }
        for(int i = 0; i < n ; i++){
            for(int j =0; j < m; j++){
                maxCol[i] = Math.max(matrix[j][i], maxCol[i]);
            }
        }
        for(int i = 0; i < m ; i++){
            for(int j =0; j < n; j++){
                if(matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) ans.add(matrix[i][j]);
            }
        }
        return ans;

    }
}