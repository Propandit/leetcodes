class Solution 
{
    public int minPathSum(int[][] grid) 
    {
        for(int r = grid.length-1; r>=0; r--) {
            for(int c = grid[0].length-1; c>=0; c--) {
                if(r == grid.length-1 && c != grid[0].length-1) {
                    grid[r][c] = grid[r][c] + grid[r][c+1];
                } else if(c == grid[0].length-1 && r != grid.length-1) {
                    grid[r][c] = grid[r+1][c] + grid[r][c];
                } else if( r != grid.length-1 && c != grid[0].length-1) {
                    grid[r][c] = grid[r][c] + Math.min(grid[r][c+1], grid[r+1][c]);
                }
            }
        }

        return grid[0][0];
    }
}