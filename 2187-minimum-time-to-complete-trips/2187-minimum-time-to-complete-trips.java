class Solution {
    public boolean cancomplete(int[] time,long mid,int total){
        long trips=0;
        for(int i:time){
           trips+=mid/i;
           if(trips>=total) {
            return true;
           }
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long l=1;
        long max=Long.MAX_VALUE,ans=0;
        for(int x:time) max=Math.min(max,x);
        long r=max*totalTrips;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(cancomplete(time,mid,totalTrips)){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;

    }
}