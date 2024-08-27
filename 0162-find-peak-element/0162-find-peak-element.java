class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;

        int srt=0;
        int end=n-1;
        while(srt<end){
        int mid=srt+(end-srt)/2;
        if(nums[mid] < nums[mid+1]) {
        srt = mid + 1;}
        else{
           end=mid; 
        }
    
        }
return srt;
    }
    }
    // public int findPeakElement(int[] a) {
    //     int low = 0, mid = 0, high = a.length - 1;
    //     while(low < high) {
    //         mid = low + (high-low)/2;
    //         if(a[mid] < a[mid+1]) low = mid+1;
    //         else high = mid;
    //     }
    //     return low;
    // }
