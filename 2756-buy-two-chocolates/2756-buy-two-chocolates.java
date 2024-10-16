class Solution {
    public int buyChoco(int[] prices, int money) {
int sum=0;
Arrays.sort(prices);
for(int i=0;i<2;i++){
    sum+=prices[i];
        }
        if(sum<=money){
            return money-sum;
        }
        else{
            return money;

        }

    }
}
// public class Solution {
//     public int buyChoco(int[] prices, int money) {
//         Arrays.sort(prices);
//         int price = prices[0] + prices[1];
//         if (price <= money) {
//             return money - price;
//         }
//         return money;
//     }
// }