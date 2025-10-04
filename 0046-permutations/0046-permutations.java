class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    HashSet<Integer> set=new HashSet<>();
    public void solve(int[] nums, ArrayList<Integer> temp){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                //do
                set.add(nums[i]);
                temp.add(nums[i]);
                //explore
                solve(nums,temp);
                //undo
                set.remove(nums[i]);
                temp.remove(temp.get(temp.size()-1));

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> temp=new ArrayList<>();
        solve(nums,temp);
        return ans;
    }
}