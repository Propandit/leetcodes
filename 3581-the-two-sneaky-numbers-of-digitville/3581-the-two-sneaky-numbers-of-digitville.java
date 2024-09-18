class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length,idx=0;
        int[] arr = new int[n];
        int[] res = new int[2];
        for(int i=0;i<n;i++)arr[nums[i]]++;
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                res[idx++]=i;
            }
        }
        return res;
    }
}