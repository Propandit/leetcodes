class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int c=0;
        for(int i:nums){
            sum+=i;
        while(i!=0){
          int rem=i%10;
          c+=rem;
          i=i/10;
        }

        }
        return sum-c;

    }
}