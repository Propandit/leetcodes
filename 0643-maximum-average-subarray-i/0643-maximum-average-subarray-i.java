class Solution {  
    public double findMaxAverage(int[] nums, int k) {  
        // First, we calculate the sum of the first k elements  
        int sum = 0;  
        for (int i = 0; i < k; i++) {  
            sum += nums[i]; // Add the first k elements to the sum  
        }  

        // Initialize maxSum to be the sum of the first k elements  
        int maxSum = sum;  

        // Now we slide the window from the (k)th element to the end of the array  
        for (int i = k; i < nums.length; i++) {  
            // Adjust the sum by removing the element that's sliding out and adding the new element  
            sum += nums[i] - nums[i - k];  

            // Update maxSum if the current sum is greater  
            maxSum = Math.max(maxSum, sum);  
        }  

        // Return the maximum average by dividing the max sum by k  
        return (double)maxSum / k;  
    }  
}