class Solution {
    // public void solve(int[] nums, ArrayList<Integer> res, ArrayList<Integer> temp,int i,int prev){
    //     if(i>=nums.length){
    //         if(temp.size()> res.size()) 
    //         {
    //             res.clear();
    //             res.addAll(temp);
    //         }
    //         return;
    //     }
    //     if(prev ==-1 || nums[i]%prev==0){
    //         temp.add(nums[i]);
    //         solve(nums,res,temp,i+1,nums[i]);
    //         temp.remove(temp.size()-1);
    //     }
    //     solve(nums,res,temp,i+1,prev);
    // }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        // ArrayList<Integer> ans=new ArrayList<>();
        // ArrayList<Integer> temp=new ArrayList<>();
        // solve(nums,ans,temp,0,-1);
        // return ans;
        int n=nums.length;
        if(n==1){
         List<Integer> res = new ArrayList<>();
         res.add(nums[0]);
         return res;
        }
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int[] prev=new int[n];
        Arrays.fill(prev,-1);
        
        int maxl=0;
        int last=-1;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] % nums[j]==0){
                   dp[i]=Math.max(dp[i],dp[j]+1);
                   prev[i]=j;
                }
                if(dp[i]>maxl){
                    maxl=dp[i];
                    last=i;
                }
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(last !=-1) 
        {res.add(nums[last]);
        last=prev[last];
        }
        return res;
    }
}