class Solution {
    public int search(int[] nums, int target) {
        // for(int i = 0; i< nums.length; i++){
        //     if(nums[i] == target) return i;
        // }
        // return -1;
        
        int left = 0, right = nums.length - 1;
        // if(nums[left] == target) return left;
        // else if(nums[right] == target) return right;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(target == nums[mid]){
                return mid;
            }
            //left sorted
            else if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target <= nums[mid]){
                  //exists in left half
                  right = mid - 1;
                }
                else{
                  left = mid + 1;
                }
            }
            // right sorted
            else if(nums[mid] <= nums[right]){
                if(target <= nums[right] && nums[mid] <= target){
                  //exist in right half
                  left = mid + 1;
                }
                else{
                  right = mid - 1;
                }
            }
        }
        return -1;
    }
}