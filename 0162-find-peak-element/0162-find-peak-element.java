class Solution {
//     public int findPeakElement(int[] nums) {
//         int n=nums.length;

//         if(n==1) return 0;

//          if(nums[0] > nums[1]) return 0;

//         if(nums[n-1] > nums[n-2]) return n-1;
//         int srt=0;
//         int end=n-1;
//         while(srt<=end){
//         int mid=srt+(end-srt)/2;

//         if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
//             return mid;
//         }
//          else if(nums[mid] < nums[mid-1]){
//              end = mid - 1;}

//         else if(nums[mid] < nums[mid+1]) {
//         srt = mid + 1;}
    
//         }
// return -1;

//     }
    public int findPeakElement(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while(low < high) {
            mid = low + (high-low)/2;
            if(a[mid] < a[mid+1]) low = mid+1;
            else high = mid;
        }
        return low;
    }
}