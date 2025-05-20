class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] q = new int[n + 1];

        for (int[] query : queries) {
            q[query[0]]++;
            if (query[1] + 1 < q.length) {
                q[query[1] + 1]--;
            }
        }

        for (int i = 1; i < n; i++) {
            q[i] += q[i - 1];
        }

        for (int i = 0; i < n; i++) {
            if (q[i] < nums[i]) return false;
        }

        return true;
    }
}