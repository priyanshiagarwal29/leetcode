class Solution {
    public int maximumCandies(int[] candies, long k) {
        int total=0,h=0,ans=0;
        for(int n:candies) 
        {
            total+=n;
             h = Math.max(n,h);
        }
        if(total<k) return 0;
        int l=1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int c=0;
            for(int cn:candies) c+=cn/mid;
            if(c>=k){
                ans=mid;
                l=mid+1;
            }
            else {
                h=mid-1;
            }
        }
        return ans;
    }
}