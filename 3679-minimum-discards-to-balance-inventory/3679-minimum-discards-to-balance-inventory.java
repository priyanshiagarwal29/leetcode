class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int n=arrivals.length,discard=0;
        HashMap<Integer,Deque<Integer>> map=new HashMap<>();
        for(int day=0;day<n;day++){
            int item=arrivals[day];
            map.putIfAbsent(item,new LinkedList<>());
            Deque<Integer> in=map.get(item);
            while(!in.isEmpty()&& in.peekFirst()<day-w+1){
                in.pollFirst();

            }
            if(in.size()<m) in.offerLast(day);
            else discard++;
        }
        return discard;
    }
}