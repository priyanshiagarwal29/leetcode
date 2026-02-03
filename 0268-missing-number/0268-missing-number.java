class Solution {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length && nums[i] !=nums[nums[i]]) swap(i,nums[i],nums);
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] !=i) return i;
        }
        return nums.length;
    }
}