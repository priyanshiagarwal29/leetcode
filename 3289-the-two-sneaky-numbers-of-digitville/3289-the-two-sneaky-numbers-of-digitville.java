class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       Arrays.sort(nums);
       ArrayList<Integer> l=new ArrayList<>();
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]) l.add(nums[i]);
       }
       int[] ans=new int[l.size()];
       for(int i=0;i<l.size();i++) ans[i]=l.get(i);
       return ans;
    }
}