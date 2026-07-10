class Solution {
    public int[] sortArray(int[] nums) {
        int minval=Integer.MAX_VALUE,maxval=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();


        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            minval=Math.min(minval,n);
            maxval=Math.max(maxval,n);
        }
       
       int index=0;
        for(int i=minval;i<=maxval;i++){
           while(map.getOrDefault(i,0)>0){
            nums[index++] =i;
            map.put(i,map.get(i)-1);
           }
        }

        return nums;


       

    }
}