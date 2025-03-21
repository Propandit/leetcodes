class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ft=nums[i];
            int temp=0;
            while(ft>0){
                int b=ft%10;
                ft/=10;
                temp++;
            }
            if(temp%2==0) count++;
        }
        return count;
    }
}