class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int vo=0,co=0;
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
             vo=Math.max(vo,map.get(c));
            else
             co=Math.max(co,map.get(c));
        }
        return vo+co;
    }
}