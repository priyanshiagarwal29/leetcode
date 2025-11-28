class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums) map.put(n,map.getOrDefault(n,0)+1);
         ArrayList<Integer> l=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {   // means number appears twice
                l.add(entry.getKey());
            }
        }

        return l;
    }
}