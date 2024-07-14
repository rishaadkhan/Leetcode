class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> freq = new HashSet<Integer>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(freq.contains(nums[i])) return true;
            freq.add(nums[i]);
        }
        return false;
    }
}