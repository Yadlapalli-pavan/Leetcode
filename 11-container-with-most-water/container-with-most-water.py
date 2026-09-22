
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        max_water = 0
        
        while left < right:
            # Calculate current area: width * min height
            width = right - left
            current_water = width * min(height[left], height[right])
            max_water = max(max_water, current_water)
            
            # Greedily move the pointer pointing to the shorter line inward
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
                
        return max_water
