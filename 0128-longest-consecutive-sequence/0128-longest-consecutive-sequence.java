class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
       // System.out.print(Arrays.toString(nums));
        if(nums.length==0) return 0;
                int count=1;
                int max=1;
        for(int i=1;i<nums.length;i++){
          if(nums[i]!=nums[i-1]){
            if(nums[i]==nums[i-1]+1){
                count++;
            }else{
                max=Math.max(count,max);
                count=1;
            }

          }
          
        }
        return Math.max(count,max) ;
    }
}