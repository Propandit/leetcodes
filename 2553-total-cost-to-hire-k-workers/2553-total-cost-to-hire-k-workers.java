class Solution {

    public long totalCost(int[] costs, int k, int candidates) {
        long sum = 0L;

        if (candidates * 2 >= costs.length) {
            Arrays.sort(costs);
            for (int i = 0; i < k; i++) {
                sum += costs[i];
            }
            return sum;
        }

        Queue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            int compare = Integer.compare(o1[0], o2[0]);
            if (compare == 0) {
                return Integer.compare(o1[1], o2[1]); 
                            } else {
                return compare;
            }
        });
        
        int left = 0;
        int right = costs.length - 1;
        for (int i = 0; i < candidates; i++) {
            queue.offer(new int[]{costs[left++], -1}); // -1 = left side
            queue.offer(new int[]{costs[right--], 1}); // 1 = right side
        }

        for (int i = 0; i < k; i++) {
            int[] poll = queue.poll();
            sum += poll[0];
            if (left <= right) {
                if (poll[1] == -1) {
                    queue.offer(new int[]{costs[left++], -1});
                } else {
                    queue.offer(new int[]{costs[right--], 1});
                }
            }
        }

        return sum;
    }
}