class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            long sp=spells[i];
            int left=0,right=potions.length-1,id=-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(sp*potions[mid]>=success){
                      id=mid;
                      right=mid-1;
                }
                else left=mid+1;
            }
            ans[i]=(id==-1)?0:(potions.length-id);
        }
        return ans;
    }
}