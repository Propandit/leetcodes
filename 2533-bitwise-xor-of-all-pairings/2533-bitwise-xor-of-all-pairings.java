class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int answer = 0, n1= nums1.length, n2 = nums2.length;
        if(n1%2 != 0)
            for(int i =0; i < n2; i++)
                answer ^= nums2[i];
        if(n2%2 != 0)
            for(int i =0; i < n1; i++)
                answer ^= nums1[i];
        return answer;
        
    }
}