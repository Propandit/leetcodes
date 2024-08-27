class Solution {
      public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) 
    {
        double[] ret=new double[n];
        ret[start]=1;
        for(int i=0;i<n;++i)
            for(int j=0;j<edges.length;++j)
            {
                int[] e=edges[j];
                if(ret[e[1]]<ret[e[0]]*succProb[j])
                    ret[e[1]]=ret[e[0]]*succProb[j]; 
                else if(ret[e[0]]<ret[e[1]]*succProb[j])
                    ret[e[0]]=ret[e[1]]*succProb[j];
            }
        return ret[end];
    }  
}