class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int i = 0,k = 1;
        if(n % 2 == 1){
            ans[i++] = 0;
        }
        for(;i < n - 1; i += 2){
            ans[i] = k * -1;
            ans[i + 1] = k++ ;

        }
        return ans;
    }
}