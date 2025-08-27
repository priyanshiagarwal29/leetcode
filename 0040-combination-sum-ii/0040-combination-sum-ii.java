class Solution {
    public void solve(int[] arr,int i,int target,List<Integer>ds,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<arr.length;j++){
            if(arr[j]>target) break;
             if (j > i && arr[j] == arr[j - 1]) continue;

            ds.add(arr[j]);
            solve(arr, j + 1, target - arr[j], ds, ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
}