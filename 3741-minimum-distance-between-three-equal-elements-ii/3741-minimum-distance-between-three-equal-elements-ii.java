class Solution {
    public int minimumDistance(int[] nums) {

        int n=nums.length;  
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
           if(map.containsKey(nums[i])){
              map.get(nums[i]).add(i);
           }
           else{
            List<Integer> l=new ArrayList<>();
            l.add(i);
            map.put(nums[i],l);
           }
        }

        int ans=Integer.MAX_VALUE;
        for(int key:map.keySet()){
            List<Integer> arr=map.get(key);
            if(arr.size()<3) continue;
            for(int i=0;i<=arr.size()-3;i++){
                int curr=Math.abs(arr.get(i+1)-arr.get(i))+
                         Math.abs(arr.get(i+2)-arr.get(i+1))+
                         Math.abs(arr.get(i+2)-arr.get(i));
                ans=Math.min(ans,curr);
            }
        }
     if(ans==Integer.MAX_VALUE) return -1;
     return ans;
    }
}