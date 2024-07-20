class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i,0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            heap.add(e);
            if(heap.size() > k) heap.poll();
        }
        int[] res = new int[k];
        int i = 0;
        while(!heap.isEmpty()){
            res[i++] = heap.poll().getKey();
        }
        return res;

        
    }
}