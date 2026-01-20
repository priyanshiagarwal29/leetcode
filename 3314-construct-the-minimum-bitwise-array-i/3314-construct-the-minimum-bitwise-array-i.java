class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {

        // brute force o(n*max(nums[i])) space o(1)
        int n=nums.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<nums.get(i);j++){
                if((j|(j+1))==nums.get(i)) 
                {
                    ans[i]=j;
                    found=true;
                    break;
                }
            }
            if(found ==false) ans[i]=-1;
        }
        return ans;

    //       for(int i=0;i<n;i++){
    //         if(nums.get(i)%2==0){
    //             ans[i]=-1;
    //             continue;
    //         }
    //         boolean found=false;
    //         for(int j=1;j<32;j++){
    //             if((nums.get(i)&(1<<j))>0) continue;
    //             int prev=j-1;
    //             //set it to 0
    //             int x=(nums.get(i) ^ (1 << (j-1))   );
    //             ans[i]=x;
    //             found=true;
    //             break;
                
    //           }
    //           if(found==false) ans[i]=-1;
    //       }
    //    return ans;
    } 
}