class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int[] ans=new int[l];
        int i=0,j=n,k=0;
        while(i<l && j<l){
          ans[k]=nums[i];
          k++;
          ans[k]=nums[j];
          i++;
          k++;
          j++;
          
        }
        return ans;
    }
}