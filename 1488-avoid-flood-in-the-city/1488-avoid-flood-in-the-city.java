class Solution {
    public int[] avoidFlood(int[] rains) {
        int n=rains.length;
        int[] ans=new int[n];
        Map<Integer,Integer> last=new HashMap<>();
        TreeSet<Integer> dry=new TreeSet<>();
                int def= 5;

        for(int i=0;i<n;i++){
            int a=rains[i];
            if(a==0){
            dry.add(i);
            ans[i]=def;
            }
            else{
                ans[i]=-1;
                if(last.containsKey(a)){
                    Integer day=dry.higher(last.get(a));
                    if(day==null) return new int[0];
                    ans[day]=a;
                    dry.remove(day);
                }
                last.put(a,i);
            }
        }
        return ans;
    }
}