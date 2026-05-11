class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int n:nums){
            String s=String.valueOf(n);
            for(char c:s.toCharArray()){
                arr.add(c-'0');
            }
        }
        int[] ans=new int[arr.size()];

        for(int i=0;i<arr.size();i++){
           ans[i]=arr.get(i);
        }
        return ans;
    }
}