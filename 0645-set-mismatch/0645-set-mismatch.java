class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        
       int[] map = new int[n + 1];
       for(int i = 0; i < n ;i++){
            map[nums[i]]++;
       }
       int repeated = -1, replaced = -1;
       for(int i = 0; i < n + 1; i++){
            if(map[i] > 1) repeated = i;
            else if(map[i] == 0) replaced = i;
       }
       
       return new int[]{repeated, replaced};
        
    }
}