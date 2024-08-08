class Solution {
    public int[][] spiralMatrixIII(int row, int col, int rs, int cs) {
        int [][] mat=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
         List<int[]> res=new ArrayList<>();
         int len=0; int d=0;
         res.add(new int[]{rs,cs});
         while(res.size()<row*col){
            if (d == 0 || d == 2) len++; 
              for (int i = 0; i < len; i++) {
                rs += mat[d][0];
                cs += mat[d][1];
                if (rs >= 0 && rs < row && cs >= 0 && cs < col) 
                    res.add(new int[]{rs, cs});
            }
            d = (d + 1) % 4; 
        
         }
         return res.toArray(new int[row * col][2]);
    }
}