class Solution {
    public int equalPairs(int[][] grid) {
        int num = 0;
		
		for (int i = 0; i < grid[0].length; i++) {
			int [] r = new int[grid.length];
			for (int j = 0; j < grid.length; j++) {
				r[j] = grid[j][i];
				
			}
			for (int [] x : grid) {
				if (Arrays.equals(r, x)) {
					num++;
				}
			}
		}
		
		
		
		return num;
    }
}