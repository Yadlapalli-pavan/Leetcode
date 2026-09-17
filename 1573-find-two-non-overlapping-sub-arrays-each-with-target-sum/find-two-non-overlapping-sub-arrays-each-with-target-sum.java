
import java.util.Arrays;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        // minLen[i] stores the minimum length of a valid subarray ending at or before index i
        int[] minLen = new int[n];
        
        int left = 0, currentSum = 0;
        int result = Integer.MAX_VALUE;
        int currentMinLen = Integer.MAX_VALUE;
        
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];
            
            // Shrink window if sum exceeds target
            while (currentSum > target) {
                currentSum -= arr[left];
                left++;
            }
            
            // Found a valid subarray with sum == target
            if (currentSum == target) {
                int len = right - left + 1;
                
                // If a non-overlapping valid subarray exists before 'left', check total length
                if (left > 0 && minLen[left - 1] != Integer.MAX_VALUE) {
                    result = Math.min(result, len + minLen[left - 1]);
                }
                currentMinLen = Math.min(currentMinLen, len);
            }
            
            minLen[right] = currentMinLen;
        }
        
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}