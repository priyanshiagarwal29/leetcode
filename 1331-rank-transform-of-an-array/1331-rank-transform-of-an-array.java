class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int c=1;
        for(int num:sorted){
             if(!map.containsKey(num)) map.put(num,c++);
        }

        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;

    }
}