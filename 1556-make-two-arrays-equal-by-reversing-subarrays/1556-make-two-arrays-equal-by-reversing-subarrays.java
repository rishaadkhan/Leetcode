class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] map = new int[1001];
        int tn = target.length, an = arr.length; 

        for(int i = 0; i < tn; i++){
            map[target[i]]++;
            map[arr[i]]--;
        }
        for(int i = 1; i < 1001; i++){
            if(map[i] != 0) return false;
        }
        return true;

    }
}