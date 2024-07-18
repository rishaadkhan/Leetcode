class Solution {
    public int specialArray(int[] nums) {
        int prev = -1, i = 0, n = nums.length;
        Arrays.sort(nums);
        while(i < n){
            
            while(i < n && nums[i] == prev){
                i++;

            }
            if(i >= n) break;
            int cSize = n - i;
            if(nums[i] == cSize || (nums[i] > cSize && prev < cSize)){
                return cSize;
            }
            
            prev = nums[i];
            i++;
        }
        return -1;
    }
}