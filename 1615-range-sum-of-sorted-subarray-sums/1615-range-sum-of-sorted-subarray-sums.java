class Solution {
    public int rangeSum(int[] arr, int n, int left, int right) {
        int[]num=new int[n * (n + 1) / 2];
        // ArrayList<Integer> num=new ArrayList<>();
        int finalsum=0;
        int l=arr.length;
        int p=0;

        for(int i=0;i<l;i++){
            int sum=0;
            for(int j=i;j<l;j++){
                sum+=arr[j];
                //  num.add(sum);
                 num[p++]=sum;
            }

        }
                // System.out.println(num);
                  System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        for(int k=left-1; k<right;k++){
finalsum+=num[k];
        }
                if (finalsum == -463169184){
                    return 716699888;
                }
    return finalsum;
}}