class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        dfs(candidates, target, ans, cur, 0);
        return ans;

    }

    private void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> cur, int index){
        if(target == 0){
            ans.add(new ArrayList<Integer>(cur));
        }
        else if( target > 0){
            for(int i = index; i < candidates.length; i++){
                if(i > index && candidates[i] == candidates[i - 1]) continue;
                cur.add(candidates[i]);
                dfs(candidates, target - candidates[i], ans, cur, i + 1);
                cur.remove(cur.get(cur.size() - 1));

            }
        }
        
    }
}