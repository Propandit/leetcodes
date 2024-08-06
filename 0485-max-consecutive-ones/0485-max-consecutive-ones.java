class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 ,Count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)  Count++;
            else{
                if (Count > max)  max = Count;
                Count = 0;
            
        }}
        return max > Count ? max : Count;
    }
}
