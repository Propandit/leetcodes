class Solution {
    public int largestAltitude(int[] gain) {
        // Arrays.sort(gain);
    //     // return gain[gain.length-1];
    //     int[] arr =new int[gain.length+1];
    //     arr[0]=0;
    //     int sum=0;
    //     for(int i=0;i<gain.length;i++){
    //         arr[i+1]=gain[i];
    //     }
    // System.out.println(Arrays.toString(arr));
    // return 0;
    int max = 0;  
        int sum = 0;
        for(int i=0;i<gain.length;i++){
            sum = sum + gain[i];
            if(sum>max)
                max=sum;
        }
        return max;
    }
}