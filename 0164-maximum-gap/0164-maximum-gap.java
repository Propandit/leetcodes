class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);
    int max=0;
for(int i=0;i<n-1;i++){
    int a=-1*(nums[i]-nums[i+1]);
     max=Math.max(max,a);
}    
return max;
}
}