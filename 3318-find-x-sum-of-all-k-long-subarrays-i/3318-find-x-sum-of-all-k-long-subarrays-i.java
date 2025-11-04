class Solution {
    public int calsum(int[] nums,int start,int end,int x){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=start;i<=end;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
list.sort((a, b) -> {
    if (!a.getValue().equals(b.getValue()))
        return b.getValue() - a.getValue();  // sort by value descending
    return b.getKey() - a.getKey();          // if values equal → by key descending
});

      int sum = 0;
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : list) {
            sum += entry.getKey() * entry.getValue();
            count++;
            if (count == x) break;
        }

        return sum;


    }
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
           ans[i]= calsum(nums,i,i+k-1,x);
        }
        return ans;
    }
}