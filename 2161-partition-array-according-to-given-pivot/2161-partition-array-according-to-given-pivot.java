class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> small=new ArrayList<>();
        ArrayList<Integer> large=new ArrayList<>();
        int c=0;

        for(int n:nums){
            if(n<pivot) small.add(n);
            else if(n==pivot) c++;
            else{
               large.add(n);
            }
        }
       int[] ans=new int[nums.length];
       int i=0;
       while(i<small.size()){
                ans[i]=small.get(i);
                i++;
       }
       for(int j=0;j<c;j++){
        ans[i++]=pivot;
       }
       for(int j=0;j<large.size();j++){
        if(i<nums.length-1)
        ans[i++]=large.get(j);
        else{
            ans[i]=large.get(j);
        }
       }
       return ans;
    }
}