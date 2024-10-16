class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int n=nums.length;
       int c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           if(nums[i]%2==0){
            arr[c++]=nums[i];
           } }
           for(int i=0;i<n;i++){
           if(nums[i]%2!=0){
            arr[c++]= nums[i];
           } 
           
        }
        return arr;
    
}}