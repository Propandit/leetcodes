class Solution {
  public void sortColors(int[] nums) {
    int left=0;
    int right=nums.length-1;
    for(int i=0;i<=right;){
        if(nums[i]==0){
            swap(nums,i++,left++);
        }
        else if(nums[i]==1){
            ++i;
        }
        else{
            swap(nums,i,right--);
        }}
        }
        private void swap(int[]nums,int i,int j){
            final int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

    }