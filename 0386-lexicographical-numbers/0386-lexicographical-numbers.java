class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer>a=new ArrayList<>();
        count(n,0,a);
        return a;
    } 
    private static void count(int maxrange, int curr,List<Integer> ans){
    if(curr>maxrange){
        return ;
    }
    if(curr!=0)
    ans.add(curr);
    int start=0;
    if(curr==0){
        start=1;
    }
    for(int i=start;i<=9;i++){
        count(maxrange,curr*10+i,ans);
    }
        
    }
}