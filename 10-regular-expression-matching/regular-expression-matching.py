
class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        # DP table initialized to False; dp[i][j] means s[0...i-1] matches p[0...j-1]
        m, n = len(s), len(p)
        dp = [[False] * (n + 1) for _ in range(m + 1)]
        
        # Empty string matches empty pattern
        dp[0][0] = True
        
        # Handles patterns like a*, a*b*, or a*b*c* matching an empty string
        for j in range(2, n + 1):
            if p[j - 1] == '*':
                dp[0][j] = dp[0][j - 2]
                
        for i in range(1, m + 1):
            for j in range(1, n + 1):
                if p[j - 1] == s[i - 1] or p[j - 1] == '.':
                    dp[i][j] = dp[i - 1][j - 1]
                elif p[j - 1] == '*':
                    # Zero occurrences of preceding element
                    dp[i][j] = dp[i][j - 2]
                    # One or more occurrences if characters match or precede '.'
                    if p[j - 2] == s[i - 1] or p[j - 2] == '.':
                        dp[i][j] = dp[i][j] or dp[i - 1][j]
                        
        return dp[m][n]
