class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix=new int[nums.length+1];
        prefix[0]=0;
        for(int i=1;i<=nums.length;i++)
          prefix[i]=prefix[i-1]+nums[i-1];
         int c=0;
          for(int i=0;i<nums.length+1;i++){
            for(int j=i+1;j<nums.length+1;j++){
                if(prefix[j]-prefix[i]==k)
                  c++;
            }
          }
          return c;
        }
}