class Solution {
    public int findTheWinner(int n, int k) {
         LinkedList<Integer> list = new LinkedList<>();
        for (int i=0;i<n;i++){
            list.add(i+1);
        }
        int c=0;
       // int x=1;

        while(list.size()!=1){
           // System.out.println(list);
            if(c > list.size() || c==list.size()) c=0;
           for(int i=0;i<k-1;i++) {
               if(c > list.size() || c==list.size()) c=0;
                c++;
               if(c > list.size() || c==list.size()) c=0;
           }
           // if (c > list.size() || c==list.size())  c = 0;


               list.remove(c);
           }



        return list.getFirst();
}
}