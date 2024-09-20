class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result=new int[2];
        int n=nums.length-2;
        boolean[] found=new boolean[n+2];
        int index=0;
        for(int num:nums){
            if (found[num]){
                result[index++]=num;

            }
            else{
                found[num]=true;
            }
            if(index==2){
                break;
            }
        }
        return result;
    }
}