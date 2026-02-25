class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] res=new Integer[arr.length];
        int i=0;
        for(int n:arr){
            res[i++]=n;
        }

        Arrays.sort(res,(a,b)->{
    int ca=Integer.bitCount(a);
    int cb=Integer.bitCount(b);
    if(ca==cb) return a-b;
    else{
        return ca-cb;
    }
        });

        
  
  i=0;
      for(int n:res) arr[i++]=n;

      return arr;
    }
}