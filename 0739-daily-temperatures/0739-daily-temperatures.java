class Solution {
    public int[] dailyTemperatures(int[] temps) {
    //  int n=temperatures.length;
    //     int [] arr=new int[n];
    //  for(int i=0;i<n;i++){
    //     int diff=0;
    //     for(int j=i+1;j<n;j++){
    //         diff++;
    //         if(temperatures[i]<temperatures[j]){
    //     arr[i]=diff;
    //     break;
    //     }
    //     }
    //  }
    //  return arr;
    
        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
    
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}
