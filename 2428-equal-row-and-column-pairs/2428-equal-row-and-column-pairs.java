class Solution {
    int count = 0;
    public int equalPairs(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                compare(grid,i,j);
            }
        }
        return count;
    }

    public void compare(int[][] grid, int r, int c){
        for(int i = 0; i < grid.length; i++){
            if(grid[r][i] != grid[i][c]) return;
        }

        count++;
    }
}