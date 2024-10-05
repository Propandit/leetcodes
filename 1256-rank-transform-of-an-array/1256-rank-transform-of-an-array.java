class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] ar=Arrays.copyOf(arr,arr.length);
        Arrays.sort(ar);
        int k=1;
        for(int i=0;i<ar.length;i++){
        if(!map.containsKey(ar[i])){
            map.put(ar[i],k++);
        }}
     int[] result=new int[ar.length];
     for(int i=0;i<ar.length;i++){
        result[i]=map.get(arr[i]);

     
    }
    return result;
    }
}