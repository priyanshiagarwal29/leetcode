class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=0;
       while(set.contains(i)){
        i++;
       }
       return i;
    }
}