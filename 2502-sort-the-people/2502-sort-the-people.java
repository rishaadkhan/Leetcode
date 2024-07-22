class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, Integer> heightMap = new HashMap<>();
        for(int i = 0; i < n ; i++){
            heightMap.put(heights[i], i);
        } 
        Arrays.sort(heights);
        String[] result = new String[n];
        for(int i = n - 1 ; i >= 0; i--){
            result[i] = names[heightMap.get(heights[n - i - 1])];
        }
        return result;
    }
}