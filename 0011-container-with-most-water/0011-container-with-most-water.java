class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,area=0;
        int ans=0;
        
        while(i<j){
        int b=Math.min(height[i],height[j]);
        area=b*(j-i);
        ans=Math.max(area,ans);
        if(height[i]<=height[j]) i++;
        else{
          j--;
        }
        }
        return ans;
    }
}