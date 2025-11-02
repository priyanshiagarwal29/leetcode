class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] ls=new int[n];
        int[] rs=new int[n];
        int s=nums[0];
        ls[0]=nums[0];

        for(int i=1;i<n;i++){
            s+=nums[i];
          ls[i]=s;
        }
        rs[n-1]=nums[n-1];
        s=nums[n-1];
        for(int i=n-2;i>=0;i--){
            s+=nums[i];
            rs[i]=s;
        }
        int ans=-1;
        for(int i=0;i<n;i++){
           if(rs[i]==ls[i]){
            ans=i;
            break;
           }
        }
        return ans;
    }
}