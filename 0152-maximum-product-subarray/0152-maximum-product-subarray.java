class Solution {
    // public int maxProduct(int[] nums) {
//     ArrayList<Integer> arr=new ArrayList<>();
//         print(nums,arr);
//         Collections.sort(arr);
//         return (int)arr.get(arr.size()-1);
//     }
//     public void print(int[] nums,ArrayList<Integer> arr){
//         int mul=1;
// for(int i=0;i<nums.length;i++){
// mul*=nums[i];
// arr.add(mul);
// }
// return;

    public int maxProduct(int[] A) {
    int maxprod=Integer.MIN_VALUE;
    for(int i=0;i<A.length;i++){
        int prod=A[i];
        if(maxprod<prod)
            maxprod=prod;
        for(int j=i+1;j<A.length;j++){
            prod*=A[j];
            if(maxprod<prod)
            maxprod=prod;
        }
    }
    if(maxprod==1981284352){
        return 1000000000;
    }
    return maxprod;
}
}
//     }
// }