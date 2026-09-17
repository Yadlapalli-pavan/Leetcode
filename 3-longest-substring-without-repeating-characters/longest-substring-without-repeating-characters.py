
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_index = {}
        max_len = 0
        left = 0
        
        for right, char in enumerate(s):
            # If char is seen and its index is inside the current window, shrink the window
            if char in char_index and char_index[char] >= left:
                left = char_index[char] + 1
            
            char_index[char] = right
            max_len = max(max_len, right - left + 1)
            
        return max_len