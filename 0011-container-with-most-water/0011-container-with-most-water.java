class Solution {
    public int maxArea(int[] height) {
        // we need to move that pointer forward whose height is minimum becoz if we did the other one the minimun will still be small
        int i=0;int j=height.length-1;
        int max=0;
        while(i<j){
          int s=Math.min(height[i],height[j]);
          int area=s*(j-i);
          max=Math.max(max,area);
          if(height[i]<=height[j]) i++;
          else if(height[i]>height[j]) j--;
        }
        return max;
    }
}