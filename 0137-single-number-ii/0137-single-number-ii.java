class Solution {
    public int singleNumber(int[] nums) {
        int seenOnce =0,seenTwice = 0;
        for(int num:nums){
            seenOnce = (seenOnce^num)&(~seenTwice);
            seenTwice = (seenTwice^num)&(~seenOnce);
        }
        return seenOnce;
    }
}