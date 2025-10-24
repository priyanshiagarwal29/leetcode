class Solution {
    public boolean helper(int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            map.put(n%10, map.getOrDefault(n%10,0)+1);

            n/=10;
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getKey()!=m.getValue()) return false;

        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        n++;
        while(true){
            if(helper(n)) return n;
            n++;
        }
    }
}