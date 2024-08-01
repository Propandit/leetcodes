class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=1;
            }
            int pro=1;
            for(int i=0;i<n;i++){
                ans[i]=pro;
                pro*=nums[i];
            }
            int suffix=1;
            for(int i=n-1;i>=0;i--){
               ans[i]*=suffix;
                suffix*=nums[i]; 
            }

        return ans;
    }
}