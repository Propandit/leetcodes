// class Solution {
//     public int maximumSwap(int num) {
//         int max=0;
//         String str = Integer.toString(num);
//         while(num!=0){
//             int rem=num%10;
//             max=Math.max(max,rem);
//             num/=10;

//         }

//         String maxi = Integer.toString(max);



//         System.out.print(str);
    
//         return max;

//     }
// }
class Solution {
    public int maximumSwap(int num) {
    int maxIndex = -1, swap1 =-1, swap2=-1 ;
    char nums[] = Integer.toString(num).toCharArray();
    int n = nums.length;

    for(int i=n-1; i>=0; i--)
    {
      if(maxIndex==-1 || nums[i]>nums[maxIndex])
      {
        maxIndex = i; 
      } 
      else if(nums[i]<nums[maxIndex])
      {
        swap1 = i;
        swap2 = maxIndex;
      }  
    }

    if(swap1!=-1 && swap2!=-1)
    {
       char temp = nums[swap1];
       nums[swap1] = nums[swap2];
       nums[swap2] = temp;
    }
      return Integer.parseInt(new String(nums)) ;
    }
}