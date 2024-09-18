class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int r=nums1.length;
        int s=nums2.length;
        int l=r+s;
        int [] arr=new int[l];
        int a=0;
        for(int i=0;i<r;i++){
            arr[a++]=nums1[i];
        }
        for(int j=0;j<s;j++){
            arr[a++]=nums2[j];
        }
        Arrays.sort(arr);

int v=l/2;
if(l%2!=0){
    return (float)arr[v];
}
else{
    return (float) (arr[v]+arr[v-1])/2;
}
    }
}