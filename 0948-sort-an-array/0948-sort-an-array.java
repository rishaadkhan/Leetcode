class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i : nums){
            heap.add(i);
        }
        int i = 0;
        while(heap.peek() != null){
            nums[i++] = heap.poll();
        }
        return nums;
    }
}