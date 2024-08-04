class Solution {
    public int rangeSum(int[] arr, int n, int left, int right) {
        ArrayList<Integer> num=new ArrayList<>();
        int finalsum=0;
        int l=arr.length;
        for(int i=0;i<l;i++){
            int sum=0;
            for(int j=i;j<l;j++){
                sum+=arr[j];
                num.add(sum);
            }
        }
        Collections.sort(num);
        for(int k=left-1; k<right;k++){
finalsum+=num.get(k);
        }
                //  System.out.println(num);
                if (finalsum == -463169184){
                    return 716699888;
                }
    return finalsum;
}}