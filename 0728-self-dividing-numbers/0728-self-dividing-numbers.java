class Solution {
    public boolean isselfdividing(int n){
        int num=n;
        while(n>0){
            int d=n%10;
            if(d==0) return false;
            if(num%d!=0) return false;
            n=n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isselfdividing(i)) 
             ans.add(i);
        }
        return ans;
    }
}