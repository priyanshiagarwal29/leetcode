class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
            set.add(n);
        int l=0,ans=0,num;
        for(int n:set){
            if(!set.contains(n-1)){
                l=0;       
                num=n;
                while(set.contains(num++))
                l++;
            }
           ans=Math.max(l,ans);
        }
        return ans;
    }
}