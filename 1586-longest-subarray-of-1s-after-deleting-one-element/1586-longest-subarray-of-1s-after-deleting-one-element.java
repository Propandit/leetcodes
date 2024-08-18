class Solution {
           public int longestSubarray(int[] nums) {
        int ans = 0;
        for (int i = 0, j = 0, sum = 0; j < nums.length; ++j) {
            sum += nums[j];
            while (i < j && sum < j - i)  {
                sum -= nums[i++];
            }
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
    }
