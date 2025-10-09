class Solution {
    public int search(int[] numbers,int left,int right,int target){
        while(left<=right){
        int mid= left+(right-left)/2;
        if(numbers[mid]==target) return mid;
        if(numbers[mid]>target)
            right=mid-1;
         else
           left=mid+1;
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n;i++){
            int remain=target-numbers[i];
            int idx=search(numbers,i+1,n-1,remain);
            if(idx!=-1) return new int[]{i+1,idx+1};
        }
        return new int[]{-1,-1};
    }
}