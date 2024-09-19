class MedianFinder {

        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        boolean even=true;
    
    public double findMedian() {
        if(even){
            return (pq1.peek()+pq2.peek())/2.0; 
        }
        else{
            return pq1.peek()/1.0;
        }
    }
    public void addNum(int num) {
        if(even){
            pq2.add(num);
            pq1.add(pq2.poll());
        }
        else{
            pq1.add(num);
            pq2.add(pq1.poll());
        }
        even=!even;
    }
    
    
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */