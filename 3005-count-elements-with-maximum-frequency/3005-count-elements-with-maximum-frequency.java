class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        int max=0,res=0;
        for(int n:nums){
            int f= ++arr[n];
            if(f>max) {
                max=f;
                res=f;
            }
            else if(f==max) res+=f;
        }
        return res;
    }
}