class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r = rowSum.length, c = colSum.length;
        int[][] res = new int[r][c];
        for(int i = 0;i < r; i++){
            res[i][0] = rowSum[i];
        }
        for(int i = 0; i < c; i++){
            double currColSum = 0;
            for(int j = 0; j < r; j++){
                currColSum += res[j][i];
            }
            int row = 0;
            while (currColSum > colSum[i]){
                double diff = currColSum - colSum[i];
                int maxShift = Math.min((int)diff,res[row][i]);
                res[row][i] -= maxShift;
                res[row][i + 1] += maxShift;
                currColSum -= (double)maxShift;
                row++;
            }
        }
        return res;
    }
}