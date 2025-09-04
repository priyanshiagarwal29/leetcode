class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int max=arr[0],min=arr[0],currmax=0,currmin=0,total=0;
        for(int i=0;i<arr.length;i++){
            currmax=Math.max(currmax+arr[i],arr[i]);
            max=Math.max(max,currmax);
            currmin=Math.min(currmin+arr[i],arr[i]);
            min=Math.min(min,currmin);
            total+=arr[i];

        }
         if (max < 0) return max;
        int circular=total-min;
        return Math.max(max,circular);
    }
}