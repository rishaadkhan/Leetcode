class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        Arrays.sort(nums1); Arrays.sort(nums2);

        int l1 = 0, l2 = 0;
        while(l1 < nums1.length && l2 < nums2.length){
            if(nums1[l1] == nums2[l2]) {
                ans.add(nums1[l1]);
                l1++;l2++;
            }
            else if(nums1[l1] < nums2[l2]) l1++;
            else l2++;
        }
        int[] result = new int[ans.size()];
        int i = 0;
        for(int value : ans){
            result[i++] = value;
        }
       
        return result;
    }
}