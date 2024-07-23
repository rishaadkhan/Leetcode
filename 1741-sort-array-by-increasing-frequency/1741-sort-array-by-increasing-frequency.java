import java.util.Arrays;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Step 1: Calculate frequencies
        int[] freq = new int[201]; // Given the range of nums is from -100 to 100
        for (int num : nums) {
            freq[num + 100]++;
        }

        // Step 2: Create an array to store the sorted elements
        int[] ans = new int[nums.length];
        int k = 0;

        // Step 3: Sort by frequency and then by value if frequencies are the same
        while (k < nums.length) {
            int minFreq = Integer.MAX_VALUE;
            int minIndex = -1;

            // Find the element with the smallest frequency (and smallest value if tied)
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0 && (freq[i] < minFreq || (freq[i] == minFreq && i > minIndex))) {
                    minFreq = freq[i];
                    minIndex = i;
                }
            }

            // Fill the answer array with this element
            if (minIndex != -1) {
                Arrays.fill(ans, k, k + minFreq, minIndex - 100);
                k += minFreq;
                freq[minIndex] = 0; // Mark this element as processed
            }
        }

        return ans;
    }

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[] nums = {2, 3, 1, 3, 2};
    //     int[] sorted = sol.frequencySort(nums);
    //     System.out.println(Arrays.toString(sorted));
    // }
}
