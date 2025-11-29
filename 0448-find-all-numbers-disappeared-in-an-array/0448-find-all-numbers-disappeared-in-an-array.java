class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums) set.add(n);
        int i=1;
        while(i<=nums.length){
            if(!set.contains(i)) ans.add(i);
            i++;
        }
        return ans;
    }
}