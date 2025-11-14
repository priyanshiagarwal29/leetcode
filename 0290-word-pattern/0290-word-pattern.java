class Solution {
    public boolean wordPattern(String pattern, String s) {
         HashMap<Character,String> map=new HashMap<>();
         String[] arr=s.split(" ");
         if(pattern.length() != arr.length) return false;
        char ch;
        String w;
        for(int i=0;i<pattern.length();i++){
            ch=pattern.charAt(i);
            w=arr[i];
            if((map.containsValue(w) || map.containsKey(ch)) && !(map.containsKey(ch) && map.get(ch).equals(w))) return false;
            else map.put(ch,w);
        }
        return true;
                
    }
}