class Solution {

    public int reverse(int n){
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
       map.put(nums[n-1],n-1);

        int ans=Integer.MAX_VALUE;

        for(int i=n-2;i>=0;i--){
            int r=reverse(nums[i]);
            if(map.containsKey(r)){
                ans=Math.min(ans,map.get(r)-i);
                }
                map.put(nums[i],i);
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;

    }
}