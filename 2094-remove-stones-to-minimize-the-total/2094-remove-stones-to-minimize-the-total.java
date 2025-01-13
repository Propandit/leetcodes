// class Solution {
//     public int minStoneSum(int[] piles, int k) {
//         int l=piles.length;
//         Arrays.sort(piles);
//         int sum=0;
//         // if(l==1){
//         //     return piles[0];
//         // }
//         // else{
//         // int [] arr=new Int[l];
//         for(int i=l-1;i>l-k-1;i--){
//             //    System.out.println(i);
//             if(piles[i]%2==0){
//                 sum+=Math.floor(piles[i]/2);
//             }
//             else{
//                sum+=Math.floor(piles[i]/2)+1;}
//         }

//         for(int i=0;i<l-k;i++){
//             sum += piles[i];
//         }
// return sum;

//     }
// }

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
         for (int pile : piles) {
            maxHeap.add(pile);
            sum += pile;
        }
        while (k-- > 0) {
            int largestPile = maxHeap.poll();
            int stonesToRemove = largestPile / 2;
            sum -= stonesToRemove;
            maxHeap.add(largestPile - stonesToRemove);
        }
        
        return sum;
    }
}
