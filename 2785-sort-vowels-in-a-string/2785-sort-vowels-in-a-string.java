class Solution {
    public String sortVowels(String s) {
        List<Character> vowel=new ArrayList<>();
        Set<Character> set=Set.of('A','E','I','O','U','a','e','i','o','u');
        for(char c:s.toCharArray()){
           if(set.contains(c)) vowel.add(c);
        }
        Collections.sort(vowel);
        StringBuilder t=new StringBuilder();
        int ind=0;
        for(char c:s.toCharArray()){
            if(set.contains(c)) t.append(vowel.get(ind++));
            else{
                t.append(c);
            }
        }
        return t.toString();
    }
}